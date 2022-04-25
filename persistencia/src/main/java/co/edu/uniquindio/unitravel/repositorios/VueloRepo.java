package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidades.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepo extends JpaRepository<Vuelo, String> {

    @Query("select v from Vuelo v where v.ciudadOrigen.nombre = :nombreCiudad")
    List<Vuelo> obtenerVuelos(String nombreCiudad);
}
