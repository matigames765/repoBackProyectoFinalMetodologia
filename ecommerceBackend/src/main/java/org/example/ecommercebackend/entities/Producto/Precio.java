package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "precios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Precio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrecio;

    @Column(name = "precio_compra")
    private Integer precioCompra;

    @Column(name = "precio_venta")
    private Integer precioVenta;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "fk_detalle_producto")
    private DetalleProducto DetalleProducto;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) //no se si va remove ya que otro precio podria tener el mismo descuento
    private Descuento descuento;


}
