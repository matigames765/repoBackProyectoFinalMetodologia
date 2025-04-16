package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

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
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "idCategoria")
    private Long idCategoria;

    //@Column(name = "tipo_producto") ver despues anotacion y manejo de enum
    //private enum EnumTipoProducto;

    @Column(name = "sexo")
    private String sexo;
}
