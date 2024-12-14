package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static Map<String, Integer> ventasPorFabricante = new HashMap<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public static void incrementarVentas(String fabricante) {
        ventasPorFabricante.put(fabricante, ventasPorFabricante.getOrDefault(fabricante, 0) + 1);
    }

    public static Fabricante fabricaMayorVentas() {
        String fabricanteMax = null;
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > maxVentas) {
                fabricanteMax = entry.getKey();
                maxVentas = entry.getValue();
            }
        }

        // En una implementación real, retornaría el objeto Fabricante con el nombre más ventas
        // Aquí retornamos una nueva instancia de Fabricante con el nombre más ventas
        return new Fabricante(fabricanteMax, new Pais("Desconocido")); // El pais es opcional aquí
    }
}

