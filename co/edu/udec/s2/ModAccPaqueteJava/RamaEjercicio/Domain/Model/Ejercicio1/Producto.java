package Domain.Model.Ejercicio1;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    } 

}
