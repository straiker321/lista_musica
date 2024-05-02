package pe.idat.services;

import java.util.Collection;

import pe.idat.entity.Musica;

public interface MusicaService {
	public abstract void insert(Musica musica);
	public abstract void update(Musica musica);
	public abstract void delete(Integer musicaId);
	public abstract Musica findById(Integer musicaId);
	public abstract Collection<Musica> findAll();
	public abstract Musica findByNombre(String nombre);
	public abstract Collection<Object[]> findAll_MusicasProductores();
}