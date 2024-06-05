package ufro.ignaciou.taller1_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "campeon")
public class Campeon {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeon")
    private Long idCampeon;
    
    @Column(name = "tipo_ataque")
    private String tipoAtaque;

    @Column(name = "vida_base")
    private Long vidaBase;

    @Column(name = "mana_bool")
    private Short manaBool;

    @Column(name = "energia_bool")
    private Short energiaBool;

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
}
