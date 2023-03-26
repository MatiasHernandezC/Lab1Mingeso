package com.milkStgo.monolitico.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String codigo;
    private String nombre;
    private Character categoria;
    private Boolean retencion;

}
