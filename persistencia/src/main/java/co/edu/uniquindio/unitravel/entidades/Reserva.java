package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    @Temporal(TemporalType.DATE)
    private Date fecha_reserva;

    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;

    @Temporal(TemporalType.DATE)
    private Date fecha_fin;

    private float precio_total;

    private boolean estado;

    private int cantidad_personas;

    public Reserva(Date fecha_reserva, Date fecha_inicio, Date fecha_fin, float precio_total, boolean estado, int cantidad_personas) {
        this.fecha_reserva = fecha_reserva;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.precio_total = precio_total;
        this.estado = estado;
        this.cantidad_personas = cantidad_personas;
    }
}
