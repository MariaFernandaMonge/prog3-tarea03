package uam.prog3.tarea03;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<ItemMenu> items = new ArrayList<>();

    void agregar(ItemMenu item) {
        items.add(item);
    }

    void agregar(ItemMenu item, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }

        for (int i = 0; i < cantidad; i++) {
            agregar(item);
        }
    }

    double calcularSubtotal() {
        double subtotal = 0;

        for (ItemMenu item : items) {
            subtotal += item.calcularPrecio();
        }

        return subtotal;
    }

    List<ItemMenu> getItems() {
        return new ArrayList<>(items);
    }

    void cobrar(MetodoPago metodo) {
        double total = metodo.calcularTotal(calcularSubtotal());

        System.out.println(
            "Total a pagar con " + metodo.getNombre() + ": ₡" + total
        );
    }
}
