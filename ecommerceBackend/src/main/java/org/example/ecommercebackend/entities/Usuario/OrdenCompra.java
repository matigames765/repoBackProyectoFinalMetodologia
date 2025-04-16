package org.example.ecommercebackend.entities.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "orden_compra")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdenCompra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdenCompra;

    private Long idUsuarioDireccion;

    @Column(name = "total")
    private Number total;

    //@Column(name = "rol")
    //private Rol rol;

    @Column(name = "descuento")
    private Number descuento;

    @Column(name = "fecha_compra")
    private String fechaCompra;

    @Column(name = "direccion_envio")
    private String direccionEnvio
            ;
}
