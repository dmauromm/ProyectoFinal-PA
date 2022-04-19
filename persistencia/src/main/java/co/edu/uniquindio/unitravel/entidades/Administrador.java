package co.edu.uniquindio.unitravel.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Administrador extends Persona implements Serializable {

    public Administrador(String cedula, String nombre, String email, String password) {
        super(cedula, nombre, email, password);
    }
}
