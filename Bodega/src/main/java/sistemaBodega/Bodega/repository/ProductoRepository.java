package sistemaBodega.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemaBodega.Bodega.endity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>
{
	Producto findByUsuario(String producto);

}
