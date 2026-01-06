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

    public void bajaCliente(String dni) {
        Cliente c = getCliente(dni);
        if (c != null) {
            c.setEsSocio(false);
        }
    }

    public void setMembresiaCliente(String dni, String tipo) {
        Cliente c = getCliente(dni);
        if (c != null) {
            c.setEsSocio(true);
            c.setTipoMembresia(tipo);
        }
    }

    public void anadirVisita(String dni, java.util.Date fecha, double importe) {
        Cliente c = getCliente(dni);
        if (c != null && numVisi < visitas.length) {
            Visita v = new Visita(c, fecha);
            v.setImporteFinal(importe);
            visitas[numVisi++] = v;
        }
    }

    public Visita[] getVisitasCliente(String dni) {
        int cant = 0;
        for (int i = 0; i < numVisi; i++) {
            if (visitas[i].getCliente().getDni().equals(dni)) {
                cant++;
            }
        }

        Visita[] visitasDelCliente = new Visita[cant];
        int indice = 0;

        for (int i = 0; i < numVisi; i++) {
            if (visitas[i].getCliente().getDni().equals(dni)) {
                visitasDelCliente[indice] = visitas[i];
                indice++;
            }
        }

        return visitasDelCliente;
    }
}
