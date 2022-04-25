package co.edu.uniquindio.unitravel.entidades;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @FutureOrPresent
    @Column(nullable = false)
    private LocalDate fechaReserva;

    @FutureOrPresent
    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Future
    @Column(nullable = false)
    private LocalDate fechaFin;

    @Column(nullable = false)
    @NonNull
    @Positive
    private double precioTotal;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    @NonNull
    @Positive
    private int cantidadPersonas;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "reserva")
    @ToString.Exclude
    private List<ReservaHabitacion> reservaHabitaciones;

    @OneToMany(mappedBy = "reserva")
    @ToString.Exclude
    private List<ReservaSilla> reservaSillas;

    public Reserva(LocalDate fechaReserva, LocalDate fechaInicio, LocalDate fechaFin, @NonNull double precioTotal, String estado, @NonNull int cantidadPersonas, Usuario usuario) {
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.cantidadPersonas = cantidadPersonas;
        this.usuario = usuario;
        this.reservaHabitaciones = new ArrayList<>();
        this.reservaSillas = new ArrayList<>();
    }
}
