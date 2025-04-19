package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.ecommercebackend.entities.Base;

@Entity
@Table(name = "descuento_producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Descuento extends Base {


    @Column(name = "fecha_inicio")
    private String fechaInicio;

    @Column(name = "fecha_fin")
    private String fechaFin;

}
