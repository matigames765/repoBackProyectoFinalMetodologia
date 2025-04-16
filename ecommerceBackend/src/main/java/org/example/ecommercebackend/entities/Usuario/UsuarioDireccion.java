package org.example.ecommercebackend.entities.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "usuario_direccion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDireccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuarioDireccion;

    private Long idUsuario;

    private Long idDireccion;
}
