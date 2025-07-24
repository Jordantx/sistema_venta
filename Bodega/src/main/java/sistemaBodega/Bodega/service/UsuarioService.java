package sistemaBodega.Bodega.service;

import java.util.Collection;

import sistemaBodega.Bodega.endity.Usuario;

public interface UsuarioService 
{
	public abstract void insert(Usuario usuario);
	public abstract void update(Usuario usuario);
	public abstract void delete(Integer id_usuario);
	public abstract Usuario findById(Integer id_usuario);
	public abstract Collection<Usuario> findAll();
}
