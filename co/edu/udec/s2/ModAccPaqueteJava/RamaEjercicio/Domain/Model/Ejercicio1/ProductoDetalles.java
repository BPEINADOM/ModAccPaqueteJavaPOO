package Domain.Model.Ejercicio1;

public class ProductoDetalles {
     
    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        Producto producto = new Producto("Celular Samsung", 2500000.0, 12);

        producto.mostrarInformacion();

        System.out.println("*********************************************");
    }
}
