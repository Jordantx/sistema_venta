package sistemaBodega.Bodega.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sistemaBodega.Bodega.endity.Usuario;
import sistemaBodega.Bodega.repository.UsuarioRepository;

@Controller

public class LoginController {

	@Autowired
	
	private UsuarioRepository  usuarioRepository ;
	
	public LoginController() {}
	
	@GetMapping("/login")
	public String index_GET() {
		return "login";
	}
	
	
	@PostMapping("/validar")
    public String validarUsuario(@RequestParam String usuario,
                                 @RequestParam String contrasena,
                                 HttpSession session,
                                 Model model) {
        Usuario user = usuarioRepository.findByUsuario(usuario);
        
        if (user != null &&
            user.getContrasena().equals(contrasena) &&
            user.getEstado().equalsIgnoreCase("activo")) {

            session.setAttribute("usuario", user);
            return "redirect:/central"; // página principal después del login

        } else {
            model.addAttribute("error", "Usuario o contraseña inválidos");
            return "login";
        }
    }
	
	

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
	
    
    
    @GetMapping("/central")
    public String centralPage(HttpSession session) {
        if (session.getAttribute("usuario") == null) {
            return "redirect:/login";
        }
        return "central";
    }

    
    
    @GetMapping("/registro")
    public String mostrarFormularioRegistro() {
        return "registro";
    }

    @PostMapping("/guardar")
    public String registrarUsuario(@RequestParam String usuario,
                                   @RequestParam String contrasena,
                                   @RequestParam String rol,
                                   Model model) {
        Usuario nuevo = new Usuario();
        nuevo.setUsuario(usuario);
        nuevo.setContrasena(contrasena);
        nuevo.setEstado("activo");
        nuevo.setRol(rol);
        usuarioRepository.save(nuevo);

        model.addAttribute("mensaje", "Usuario registrado correctamente. Inicia sesión.");
        return "login";
    }
}
