package pe.idat.services;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import pe.idat.entity.Musica;

@Component
@Profile("developing")
public class MusicaServiceDev implements MusicaService
{
	private static Map<Integer,Musica> repositoryDev=new HashMap<>();
	static
	{
		Musica musica1 =new Musica(1,"u2","rock",LocalDate.of(2022,10,20),"5");
		Musica musica2 =new Musica(2,"bon jovi","rock",LocalDate.of(2022,4,14),"12");
		
		repositoryDev.put(musica1.getMusicaId(),musica1);
		repositoryDev.put(musica2.getMusicaId(),musica2);
		
		
	}
	@Override
	public void insert(Musica musica) {
		musica.setMusicaId(repositoryDev.size()+1);
		repositoryDev.put(musica.getMusicaId(),musica);
	}

	@Override
	public void update(Musica musica) {
		repositoryDev.put(musica.getMusicaId(), musica);
		
	}

	@Override
	public void delete(Integer musicaId) {
		repositoryDev.remove(musicaId);
		
	}

	@Override
	public Musica findById(Integer musicaId) {
		return repositoryDev.get(musicaId);
	}

	@Override
	public Collection<Musica> findAll() {
		return repositoryDev.values();
	}

	@Override
	public Musica findByNombre(String nombre)
	{
		Collection<Musica> bMusica=repositoryDev.values();
		for(Musica musica:bMusica)
		{
			if(musica.getNombre().equals(nombre))
			{
				return musica;
			}
		}
		return null;
	}

	@Override
	public Collection<Object[]> findAll_MusicasProductores() {
		// TODO Auto-generated method stub
		return null;
	}
	
}