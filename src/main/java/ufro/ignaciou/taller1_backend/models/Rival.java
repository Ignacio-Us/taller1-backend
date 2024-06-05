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
@Table(name = "rival")
public class Rival {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rival", nullable = false)
    private Integer idRival;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;
    
    @OneToOne
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private Especie especie;

    @OneToMany(mappedBy = "rival")
    private Set<Campeon> campeons;
}
