package com.example.oauth.services;

import com.example.usuarioscommon.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
