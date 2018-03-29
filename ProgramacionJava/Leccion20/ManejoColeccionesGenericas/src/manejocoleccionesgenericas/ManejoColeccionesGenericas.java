package manejocoleccionesgenericas;

import java.util.*;

public class ManejoColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
         miLista.add("5");
          miLista.add("6");
           miLista.add("7");
            miLista.add("8");
             miLista.add("9");
              miLista.add("10");
        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("1", "1-Juan");
        miMapa.put("2", "2-Carlos");
        miMapa.put("3", "3-Rosario");
        miMapa.put("4", "4-Esperanza");
          miMapa.put("5", "5-Esperanza");
            miMapa.put("6", "6-Esperanza");
              miMapa.put("7", "7-Esperanza");
              miMapa.put("8", "8-Esperanza");
              miMapa.put("9", "9-Esperanza");
              miMapa.put("10", "10-Esperanza");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}