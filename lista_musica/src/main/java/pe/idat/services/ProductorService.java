package pe.idat.services;

import java.util.Collection;

import pe.idat.entity.Productor;

public interface ProductorService {
	public abstract void insert(Productor productor);
	public abstract void update(Productor productor);
	public abstract void delete(Integer productorId);
	public abstract Productor findById(Integer productorId);
	public abstract Collection<Productor> findAll();
}
