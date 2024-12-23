package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        
        // Incrementar las ventas para el país y fabricante
        Pais.incrementarVentas(fabricante.getPais().getNombre());
        Fabricante.incrementarVentas(fabricante.getNombre());
    }

    public int getPuestos() {
        return puestos;
    }
}
