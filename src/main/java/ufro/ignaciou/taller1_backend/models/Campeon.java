package ufro.ignaciou.taller1_backend.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import lombok.Data;

@Entity
@Data
@Table(name = "campeon")
public class Campeon {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeon", nullable = false)
    private Integer idCampeon;
    
    @Column(name = "tipo_ataque", nullable = false)
    private String tipoAtaque;

    @Column(name = "vida_base", nullable = false)
    private Integer vidaBase;

    @Column(name = "mana_bool", nullable = false)
    private Boolean manaBool;

    @Column(name = "energia_bool", nullable = false)
    private Boolean energiaBool;

    @Column(name = "velocidad_ataque_base", nullable = false)
    private Float velocidadAtaqueBase;

    @Column(name = "velocidad_movimiento_base", nullable = false)
    private Float velocidadMovimientoBase;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;

    @OneToOne
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter", nullable = false)
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival", nullable = false)
    private Rival rival;

    @ManyToMany
    @JoinTable(
        name = "campeon_has_interaccion",
        joinColumns = @JoinColumn(name = "campeon_id_campeon"),
        inverseJoinColumns = @JoinColumn(name = "interaccion_id_interaccion")
    )
    private Set<Interaccion> interaccions;
}
