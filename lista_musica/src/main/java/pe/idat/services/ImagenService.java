package pe.idat.services;

import java.util.Collection;

import pe.idat.entity.Imagen;

public interface ImagenService {
	public abstract void insert(Imagen imagen);
	public abstract Collection<Imagen> findAll();
	public abstract Imagen findById(Integer imagenId);
	public abstract void update(Imagen imagen);
	public abstract void delete(Integer imagenId);
}