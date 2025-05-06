package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.*;
import org.example.ecommercebackend.entities.Base;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "talles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Talles extends Base {

    @Column(name = "talle")
    private String talle;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleProducto> detallesProductos = new ArrayList<DetalleProducto>();
}