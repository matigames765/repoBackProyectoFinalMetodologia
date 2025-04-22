package org.example.ecommercebackend.controllers.Producto;

import org.example.ecommercebackend.controllers.BaseController;
import org.example.ecommercebackend.entities.Producto.Descuento;
import org.example.ecommercebackend.entities.Producto.Talles;
import org.example.ecommercebackend.services.Producto.DescuentoService;
import org.example.ecommercebackend.services.Producto.TallesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talles")
public class TallesController extends BaseController<Talles,Long> {

    @Autowired
    private TallesService tallesService;

    public TallesController(TallesService tallesService) {
        super(tallesService);
    }
}

