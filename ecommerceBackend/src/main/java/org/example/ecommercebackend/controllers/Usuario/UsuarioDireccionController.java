package org.example.ecommercebackend.controllers.Usuario;

import org.example.ecommercebackend.controllers.BaseController;
import org.example.ecommercebackend.entities.Usuario.Usuario;
import org.example.ecommercebackend.entities.Usuario.UsuarioDireccion;
import org.example.ecommercebackend.services.Usuario.UsuarioDireccionService;
import org.example.ecommercebackend.services.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarioDireccion")
public class UsuarioDireccionController extends BaseController<UsuarioDireccion,Long> {

    @Autowired
    private UsuarioDireccionService usuarioDireccionService;

    public UsuarioDireccionController(UsuarioDireccionService usuarioDireccionService) {
        super(usuarioDireccionService);
    }
}