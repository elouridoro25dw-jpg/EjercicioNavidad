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

    public Cliente getCliente(String dni) {
        for (int i = 0; i < numClie; i++) {
            if (clientes[i].getDni().equals(dni)) {
                return clientes[i];
            }
        }
        return null;
    }

    public void anadirCliente(Cliente c) {
        if (numClie < clientes.length) {
            clientes[numClie++] = c;
        }
    }
}
