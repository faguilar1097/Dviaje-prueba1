package com.dviaje.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dviaje.app.entity.Usuario;
import com.dviaje.app.service.IUsuarioService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class UsuarioRestController {

	@Autowired
	IUsuarioService usuarioService;
	
	@GetMapping("/usuario") //localhost:puerto/api/usuarios
	public List<Usuario> usuario(){
		return usuarioService.findAllUsuarios();		
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario usuarioById(@PathVariable Long id) {		
		return usuarioService.findUsuarioById(id);
	}
	
	@PostMapping("/usuario")
	public Usuario newUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario replaceUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
		//Filtros para asegurar que esté un ID y exista
		return usuarioService.updateUsuario(id,usuario); 
	}
	
	@DeleteMapping("usuario/{id}")
	public Usuario byeUsuario(@PathVariable Long id) {
		return usuarioService.deleteUsuarioById(id);
	}
}
