package co.edu.uniquindio.unitravel.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AdministradorHotel extends Persona implements Serializable {

    public AdministradorHotel(String cedula, String nombre, String email, String password) {
        super(cedula, nombre, email, password);
    }

}
