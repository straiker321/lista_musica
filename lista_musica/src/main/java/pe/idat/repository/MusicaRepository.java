package pe.idat.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.idat.entity.Musica;

public interface MusicaRepository extends JpaRepository<Musica,Integer>{
	public abstract Musica findByNombre(String nombre);
	
	@Query(value="select * from musicas_productores" ,nativeQuery=true)
	public abstract Collection<Object[]> findAll_MusicasProductores();
}