package ufro.ignaciou.taller1_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "porcentaje_victoria")
    private Float porcentajeVictoria;

    @Column(name = "porcentaje_derrota")
    private Float porcentajeDerrota;

    /*
    @Column(name = "nacionalidad_id_nacionalidad")
    private
    */
}
