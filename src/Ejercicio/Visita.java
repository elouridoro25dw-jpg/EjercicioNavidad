package Ejercicio;

import java.util.Date;

public class Visita {
    private Cliente cliente;
    private Date fecha;
    private double importeFactura;

    public Visita(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.importeFactura = 0.0;
    }
}
