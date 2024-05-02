package pe.idat.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Categoria;
import pe.idat.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl  implements CategoriaService{
	@Autowired
	private CategoriaRepository repository;
	@Override
	@Transactional
	public void insert(Categoria categoria) {
		repository.save(categoria);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Categoria> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional
	public void update(Categoria categoria) {
		repository.save(categoria);
		
	}

	@Override
	@Transactional
	public void delete(Integer categoriaId) {
		repository.deleteById(categoriaId);
	}

	@Override
	@Transactional(readOnly=true)
	public Categoria findById(Integer categoriaId) {
		return repository.findById(categoriaId).orElse(null);
	}
}
