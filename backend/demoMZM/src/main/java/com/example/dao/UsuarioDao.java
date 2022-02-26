package com.example.dao;

import java.util.List;

import com.example.Usuario;

public interface UsuarioDao {
	List<Usuario> getUsuarios();

	void eliminar(Long id);
}
