package ufro.ignaciou.taller1_backend.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_counter")
    private Long idCounter;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "porcentaje_victoria")
    private Float porcentajeVictoria;

    @Column(name = "porcentaje_derrota")
    private Float porcentajeDerrota;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad")
    private Nacionalidad nacionalidad;
    
    @OneToOne
    @JoinColumn(name = "especie_id_especie")
    private Especie especie;

    @OneToMany(mappedBy = "counter")
    private Set<Campeon> campeons;
}
