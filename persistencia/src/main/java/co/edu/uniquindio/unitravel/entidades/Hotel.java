package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private String nombre;

    private String direccion;

    private String telefono;

    private int num_estrellas;

    public Hotel(String nombre, String direccion, String telefono, int num_estrellas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.num_estrellas = num_estrellas;
    }
}
