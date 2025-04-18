package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "detalle_producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetalleProducto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalleProducto;

    @ManyToOne()
    @JoinColumn(name = "fk_talle")
    private Talles talle;

    @Column(name = "stock")
    private Number stock;

    //private Long idproducto; para mi no va aca

    @Column(name = "color")
    private String color;

    @Column(name = "estado")
    private Boolean estado;
}
