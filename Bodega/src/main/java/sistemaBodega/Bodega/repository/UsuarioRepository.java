package sistemaBodega.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemaBodega.Bodega.endity.Usuario;


@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>
{
	Usuario findByUsuario(String usuario);
}
