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
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@Audited preguntar si hacer auditoria
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne()
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;

    @Column(name = "tipo_producto")
    private TipoProducto tipoProducto;

    @Column(name = "sexo")
    private String sexo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleProducto> detalleProductos = new ArrayList<DetalleProducto>();
}
