package sistemaBodega.Bodega.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sistemaBodega.Bodega.endity.Producto;
import sistemaBodega.Bodega.endity.Usuario;
import sistemaBodega.Bodega.repository.ProductoRepository;
import sistemaBodega.Bodega.repository.UsuarioRepository;

@Controller
@RequestMapping("/producto")
public class ProductoController {

		
    @Autowired
    private ProductoRepository productoRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/listar")
    public String listarProductos(Map map) {
       
    	//llave-valor
    			map.put("bProducto",productoRepository.findAll());
        
        return "Producto/listar"; // productos.jsp en /WEB-INF/views/

    }
    
    @GetMapping("/registrar")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("listaUsuarios", usuarioRepository.findAll()); // 👈 necesario para el <form:options>
        return "Producto/registrar";
    }
    @PostMapping("/registrar")
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        if (producto.getUsuario() != null && producto.getUsuario().getId_usuario() != null) {
            Usuario usuario = usuarioRepository.findById(producto.getUsuario().getId_usuario()).orElse(null);
            producto.setUsuario(usuario);
        }
        
        // Asignar estado por defecto "activo"
        producto.setEstado("activo");

       
        
        productoRepository.save(producto);
        return "redirect:/producto/listar";
    }
    
    
    
    
    


}
