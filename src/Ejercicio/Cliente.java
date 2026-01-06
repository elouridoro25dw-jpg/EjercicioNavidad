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
}
