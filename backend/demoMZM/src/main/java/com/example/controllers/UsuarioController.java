package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Usuario;
import com.example.dao.UsuarioDao;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDao usuarioDao;	
	
	
	@RequestMapping(value="api/usuarios/{id}", method = RequestMethod.GET)
		public List<Usuario> getUsuarios() {
			return usuarioDao.getUsuarios();
		}
		
		@RequestMapping(value="api/usuarioEditar")
		public Usuario editarUsuario() {
			Usuario usuario = new Usuario();
			
			return usuario;
		}
		
		@RequestMapping(value="api/usuarios/{id}", method = RequestMethod.DELETE)
		public void eliminar(@PathVariable Long id) {
			usuarioDao.eliminar(id);
			
		}
}
