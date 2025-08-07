package sistemaBodega.Bodega.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistemaBodega.Bodega.endity.Producto;
import sistemaBodega.Bodega.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService
{
	
	@Autowired
	private ProductoRepository repository;
	public void insert(Producto producto) {
		repository.save(producto);		
	}

	@Override
	public void update(Producto producto) {
		repository.save(producto);
		
	}

	@Override
	public void delete(Integer id_producto) {
		repository.deleteById(id_producto);
		
	}

	@Override
	public Producto findById(Integer id_producto) {
		return repository.findById(id_producto).orElse(null);
		
	}

	@Override
	public Collection<Producto> findAll() {
		return repository.findAll();
	}
	
}
