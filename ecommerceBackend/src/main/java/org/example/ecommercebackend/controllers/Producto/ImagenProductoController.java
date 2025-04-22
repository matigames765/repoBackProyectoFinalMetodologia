package org.example.ecommercebackend.controllers.Producto;

import org.example.ecommercebackend.controllers.BaseController;
import org.example.ecommercebackend.entities.Producto.ImagenProducto;
import org.example.ecommercebackend.services.Producto.DescuentoService;
import org.example.ecommercebackend.services.Producto.ImagenProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenProducto")
public class ImagenProductoController extends BaseController<ImagenProducto,Long> {

    @Autowired
    private ImagenProductoService imagenProductoService;

    public ImagenProductoController(ImagenProductoService imagenProductoService) {
        super(imagenProductoService);
    }
}

