package org.example.ecommercebackend.entities.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "rol")
    private Rol rol;

    @Column(name = "email")
    private String email;

    @Column(name = "dni")
    private Integer dni;

    @Column(name = "direccion")
    private String direccion;
}
