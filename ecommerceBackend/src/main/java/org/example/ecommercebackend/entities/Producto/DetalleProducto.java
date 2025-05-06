package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.*;
import org.example.ecommercebackend.entities.Base;

@Entity
@Table(name = "detalle_producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DetalleProducto extends Base {

    @ManyToOne()
    @JoinColumn(name = "fk_talle")
    private Talles talledetalleProductos;

    @Column(name = "stock")
    private Number stock;

    //private Long idproducto; para mi no va aca

    @Column(name = "color")
    private String color;

    @Column(name = "estado")
    private Boolean estado;

    
}
