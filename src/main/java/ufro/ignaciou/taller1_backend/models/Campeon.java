package ufro.ignaciou.taller1_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    @Column(name = "id_campeon")
    private Integer idCampeon;
    
    @Column(name = "tipo_ataque")
    private String tipoAtaque;

    @Column(name = "vida_base")
    private Integer vidaBase;

    @Column(name = "mana_bool")
    private Boolean manaBool;

    @Column(name = "energia_bool")
    private Boolean energiaBool;

    @Column(name = "velocidad_ataque_base")
    private Float velocidadAtaqueBase;

    @Column(name = "velocidad_movimiento_base")
    private Float velocidadMovimientoBase;

    @Column(name = "nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad")
    private Nacionalidad nacionalidad;

    @OneToOne
    @JoinColumn(name = "especie_id_especie")
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter")
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival")
    private Rival rival;
}
