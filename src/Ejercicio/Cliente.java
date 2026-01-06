package Ejercicio;

public class Cliente {
    private String nombre;
    private String dni;
    private boolean esSocio;
    private String tipoMembresia;

    // Constructor completo
    public Cliente(String nombre, String dni, boolean esSocio, String tipoMembresia) {
        this.nombre = nombre;
        this.dni = dni;
        this.esSocio = esSocio;
        this.tipoMembresia = tipoMembresia;
    }

    // Constructor para los que no sean socios
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.esSocio = false;
        this.tipoMembresia = "";
    }

    public double getDescuento() {
        double descuentoFinal;
        if (esSocio == true) {
            switch (tipoMembresia) {
                case "Premium":
                    descuentoFinal = 0.20;
                    break;
                case "Oro":
                    descuentoFinal = 0.15;
                    break;
                case "Platino":
                    descuentoFinal = 0.10;
                    break;
                default:
                    descuentoFinal = 0.0;
                    break;
            }
        } else {
            descuentoFinal = 0.0;
        }
        return descuentoFinal;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        String textoMembresia = "";
        if (esSocio) {
            textoMembresia = " - Miembro: " + tipoMembresia;
        }

        return "Cliente: " + nombre + " (DNI: " + dni + ")" + textoMembresia;
    }
}
