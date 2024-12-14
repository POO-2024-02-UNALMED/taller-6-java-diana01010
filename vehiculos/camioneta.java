

public class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(String placa, int puestos, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, 4, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }
}
