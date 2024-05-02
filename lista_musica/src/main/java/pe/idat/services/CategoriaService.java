package pe.idat.services;

import java.util.Collection;

import pe.idat.entity.Categoria;

public interface CategoriaService {
	public abstract void insert(Categoria categoria);
	public abstract void update(Categoria categoria);
	public abstract void delete(Integer categoriaId);
	public abstract Categoria findById(Integer categoriaId);
	public abstract Collection<Categoria> findAll();
}