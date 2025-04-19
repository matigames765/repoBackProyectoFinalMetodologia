package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.ecommercebackend.entities.Base;

@Entity
@Table(name = "detalle_producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImagenProducto extends Base {


    @Column(name = "url")
    private String url;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "fk_detalle_producto")
    private DetalleProducto DetalleProducto;

    @Column(name = "alt")
    private String alt;

}
