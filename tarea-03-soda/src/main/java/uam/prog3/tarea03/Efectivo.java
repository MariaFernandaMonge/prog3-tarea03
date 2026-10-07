package uam.prog3.tarea03;

class Efectivo implements MetodoPago {

    @Override
    public String getNombre() {
        return "Efectivo";
    }

    @Override
    public double calcularTotal(double subtotal) {
        return subtotal;
    }
}