package Ejercicio;

import java.util.Date;

public class Main {
    static void main() {
        Salon esquina= new Salon(10,10);

        esquina.anadirCliente(new Cliente("Pepito", "45365432U"));
        esquina.anadirCliente(new Cliente("Josema", "4850636T"));
        esquina.anadirCliente(new Cliente("Trujillo", "4324357H"));

        esquina.setMembresiaCliente("45365432U", "Premium");
        esquina.setMembresiaCliente("4850636T", "Oro");

        Date hoy = new Date();
        esquina.anadirVisita("45365432U", hoy, 100.0);
        esquina.anadirVisita("4850636T", hoy, 100.0);
        esquina.anadirVisita("4324357H", hoy, 100.0);

        System.out.println("--- TODAS LAS VISITAS ---");
        esquina.mostrarVisitas();

        System.out.println("Visitas de Trujillo (4324357H):");
        Visita[] susVisitas = esquina.getVisitasCliente("4324357H");
        for (int i = 0; i < susVisitas.length; i++) {
            Visita v = susVisitas[i];
            System.out.println(v);
        }
    }
}
