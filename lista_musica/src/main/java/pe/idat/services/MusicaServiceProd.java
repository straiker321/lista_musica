package pe.idat.services;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Musica;
import pe.idat.repository.MusicaRepository;

@Service
@Profile("production")
public class MusicaServiceProd implements MusicaService{
	@Autowired
	private MusicaRepository repositoryProd;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void insert(Musica musica) {
		repositoryProd.save(musica);
		
	}

	@Override
	@Transactional
	public void update(Musica musica) {
		repositoryProd.save(musica);
		
	}

	@Override
	@Transactional
	public void delete(Integer musicaId) {
		repositoryProd.deleteById(musicaId);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Musica findById(Integer musicaId) {
		return repositoryProd.findById(musicaId).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Musica> findAll() {
		return repositoryProd.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Musica findByNombre(String nombre)
	{
		Query query=entityManager.createNativeQuery("select * from musicas where nombre=?1",Musica.class);
		query.setParameter(1,nombre);
		return(Musica)query.getSingleResult();
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Object[]> findAll_MusicasProductores() {
		return repositoryProd.findAll_MusicasProductores();
	}
}