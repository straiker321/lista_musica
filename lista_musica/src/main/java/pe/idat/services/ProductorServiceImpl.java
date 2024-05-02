package pe.idat.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Productor;
import pe.idat.repository.ProductorRepository;

@Service
public class ProductorServiceImpl implements ProductorService{
	
	@Autowired
	private ProductorRepository productorRepository;
	@Override
	@Transactional
	public void insert(Productor productor) {
		productorRepository.save(productor);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Productor> findAll() {
		return productorRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Productor productor) {
		productorRepository.save(productor);
	}

	@Override
	@Transactional
	public void delete(Integer productorId) {
		productorRepository.deleteById(productorId);
	}

	@Override
	@Transactional(readOnly=true)
	public Productor findById(Integer productorId) {
		return productorRepository.findById(productorId).orElse(null);
	}

}
