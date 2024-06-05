package ufro.ignaciou.taller1_backend.models;

import java.util.Set;

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
@Table(name = "nacionalidad")
public class Nacionalidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nacionalidad")
    private Long idNacionalidad;

    @Column(name = "nombre")
    private Enum nombre;

    @OneToOne(mappedBy = "nacionalidad")
    private Set<Counter> counters;

    @OneToOne(mappedBy = "nacionalidad")
    private Set<Rival> rivals;

    @OneToOne(mappedBy = "nacionalidad")
    private Set<Campeon> campeons;
}
