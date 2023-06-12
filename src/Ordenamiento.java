import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {
    public void bubbleSort(List<Plato> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).getPrecio()> lista.get(j+1).getPrecio()) {
                    // Intercambiar los elementos
                    Plato temp = lista.get(j);
                    lista.get(j) = lista.get(j+1);
                    lista.get(j+1) = temp;
                }
            }
        }
    }
}
