package org.example.ecommercebackend.entities.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "orden_compra_detalle")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdenCompraDetalle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdenCompra;


    private Long idProducto;

    @Column(name = "cantidad")
    private Number cantidad;

}
