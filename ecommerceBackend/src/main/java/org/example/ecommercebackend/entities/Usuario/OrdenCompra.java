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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_usuario_direccion")
    private UsuarioDireccion usuarioDireccion;

    @Column(name = "total")
    private Integer total;

    @Column(name = "descuento")
    private Integer descuento; //poner id del descuento?

    @Column(name = "fecha_compra")
    private String fechaCompra;

    @Column(name = "direccion_envio")
    private String direccionEnvio;
}
