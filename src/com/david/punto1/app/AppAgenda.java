package com.david.punto1.app;

import java.util.List;
import com.david.punto1.dominio.Agenda;
import com.david.punto1.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.crearContacto("Pablo", "perez", 30000);
        agenda.crearContacto("Angie", "Pardo", 31000);
        agenda.crearContacto("Pablo", "Alboran", 32000);
        agenda.crearContacto("Javier", "Ibarra", 33000);
        agenda.crearContacto("CaRiTo", "PeReZ", 34000);

        agenda.cambiarCelular(33000, 33333);
        Contacto buscado = agenda.buscar(33333);
        System.out.println("Por celular: " + buscado.getNombre());

        List<Contacto> buscados = agenda.buscarPorApellido("PEREZ");

        buscados.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellido()));

        System.out.println(agenda.getNumeroDeContactos());
        agenda.ordenar().forEach(contacto -> {
            System.out.println(contacto.getNombre());
        });
    }
}
