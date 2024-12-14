package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(String placa, int puestos, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, 4, 90, nombre, precio, peso, "4X4", fabricante); // Inicialización de atributos heredados
        this.volco = volco;

        // Incrementar las ventas del país y del fabricante
        Pais.incrementarVentas(fabricante.getPais().getNombre());
        Fabricante.incrementarVentas(fabricante.getNombre());
    }

    public boolean isVolco() {
        return volco;
    }
}
