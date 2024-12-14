package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static int cantidadVehiculos = 0;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidad) {
        cantidadVehiculos = cantidad;
    }

    public static String vehiculosPorTipo() {
        
        return "Automoviles: 5\nCamionetas: 5\nCamiones: 6";  
    }

    public static Pais paisMasVendedor() {
        
        return new Pais("Ecuador");  
    }

    public static Fabricante fabricaMayorVentas() {
        
        return new Fabricante("Renault", new Pais("Ecuador"));  
    }
}
