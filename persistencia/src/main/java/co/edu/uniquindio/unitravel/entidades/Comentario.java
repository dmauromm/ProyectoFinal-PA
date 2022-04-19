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
public class Comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private String comentario;

    private int calificacion;

    @Temporal(TemporalType.DATE)
    private Date fecha_calificacion;

    public Comentario(String comentario, int calificacion, Date fecha_calificacion) {
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha_calificacion = fecha_calificacion;
    }
}
