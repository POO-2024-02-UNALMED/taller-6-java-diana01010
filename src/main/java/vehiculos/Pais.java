package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static Map<String, Integer> ventasPorPais = new HashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void incrementarVentas(String pais) {
        ventasPorPais.put(pais, ventasPorPais.getOrDefault(pais, 0) + 1);
    }

    public static Pais paisMasVendedor() {
        String paisMax = null;
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > maxVentas) {
                paisMax = entry.getKey();
                maxVentas = entry.getValue();
            }
        }
        
        return new Pais(paisMax); // Retorna el país con más ventas
    }
}
