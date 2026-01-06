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

    public void setImporteFinal(double importeBruto) {
        double descuento = cliente.getDescuento();
        this.importeFactura = importeBruto * (1 - descuento);
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + " | " + cliente.toString() + " | Pagado: " + importeFactura + "€";
    }
}
