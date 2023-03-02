package Fechas;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaDefinida = LocalDate.of(2022, Month.JANUARY,31);

        if(fechaActual.isBefore(fechaDefinida)){
            System.out.println("aun puedes hacer el pago");
        }{
            System.out.println("fecha de pago vencida");
        }

        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaHora = LocalDateTime.of(fechaActual,horaActual);

        LocalDate fechaCumple = LocalDate.of(2000,Month.APRIL,23);

        System.out.println(Period.between(fechaCumple,LocalDate.now()).getYears());

    }
}
