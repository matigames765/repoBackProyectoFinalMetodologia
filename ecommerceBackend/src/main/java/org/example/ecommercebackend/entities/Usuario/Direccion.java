package org.example.ecommercebackend.entities.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "direcciones")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Direccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "pais")
    private String pais;

    //@Column(name = "rol")
    //private Rol rol;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "departamento")
    private String departamento;

}
