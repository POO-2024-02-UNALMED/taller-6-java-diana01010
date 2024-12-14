package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante); // Inicialización de atributos heredados
        this.ejes = ejes;

        // Incrementar las ventas del país y del fabricante
        Pais.incrementarVentas(fabricante.getPais().getNombre());
        Fabricante.incrementarVentas(fabricante.getNombre());
    }

    public int getEjes() {
        return ejes;
    }
}


