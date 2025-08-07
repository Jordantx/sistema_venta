package sistemaBodega.Bodega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import sistemaBodega.Bodega.repository.UsuarioRepository;
@Controller
public class Model {
	@Autowired	
	private UsuarioRepository  usuarioRepository ;
	
	public Model() {}
	
	@GetMapping("/yosoy")
	public String index_GET() {
		return "yosoy";
	}	

}
