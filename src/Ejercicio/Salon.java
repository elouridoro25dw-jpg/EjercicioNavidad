package Ejercicio;

public class Salon {
    private Cliente[] clientes;
    private Visita[] visitas;
    private int numClie;
    private int numVisi;

    public Salon(int maxNumClientes, int maxNumVisitas) {
        this.clientes = new Cliente[maxNumClientes];
        this.visitas = new Visita[maxNumVisitas];
        this.numClie = 0;
        this.numVisi = 0;
    }
}
