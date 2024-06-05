package ufro.ignaciou.taller1_backend.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "interaccion")
public class Interaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_interaccion", nullable = false)
    private Integer idInteraccion;
    
    @Column(name = "nombre_interaccion", nullable = false)
    private String nombreInteraccion;

    @Column(name = "limite_interaccion", nullable = false)
    private Integer limiteInteraccion;

    @ManyToMany(mappedBy = "interaccions")
    private Set<Campeon> campeons;
}