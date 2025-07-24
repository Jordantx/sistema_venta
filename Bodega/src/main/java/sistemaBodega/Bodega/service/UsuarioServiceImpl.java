package sistemaBodega.Bodega.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistemaBodega.Bodega.endity.Usuario;
import sistemaBodega.Bodega.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService
{
	
	@Autowired
	private UsuarioRepository repository;

	@Override 
	public void insert(Usuario usuario) {
		repository.save(usuario);		
	}

	@Override
	public void update(Usuario usuario) {
		repository.save(usuario);
		
	}

	@Override
	public void delete(Integer id_usuario) {
		repository.deleteById(id_usuario);
		
	}

	@Override
	public Usuario findById(Integer id_usuario) {
		return repository.findById(id_usuario).orElse(null);
		
	}

	@Override
	public Collection<Usuario> findAll() {
		return repository.findAll();
	}

}
