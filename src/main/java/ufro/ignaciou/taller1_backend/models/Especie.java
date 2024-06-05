package ufro.ignaciou.taller1_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "especie")
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especie", nullable = false)
    private Integer idEspecie;

    @Column(name = "nombre", nullable = false)
    private Enum nombre;

    @OneToOne(mappedBy = "especie")
    private Counter counter;

    @OneToOne(mappedBy = "especie")
    private Rival rival;

    @OneToOne(mappedBy = "especie")
    private Campeon campeon;
}
