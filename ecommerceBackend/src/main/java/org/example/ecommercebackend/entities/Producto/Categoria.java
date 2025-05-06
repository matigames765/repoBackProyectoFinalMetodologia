package org.example.ecommercebackend.entities.Producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.ecommercebackend.entities.Base;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorias")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Categoria extends Base {



    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos = new ArrayList<Producto>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;

    @OneToMany(mappedBy = "categoriaPadre")
    private List<Categoria> subcategorias = new ArrayList<>();

}


