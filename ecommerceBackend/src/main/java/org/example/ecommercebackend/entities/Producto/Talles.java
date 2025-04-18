package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "talles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Talles implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTalle;

    @Column(name = "talle")
    private String talle;

    @OneToMany(mappedBy = "talles")
    private List<DetalleProducto> detalleProductos = new ArrayList<DetalleProducto>();

}