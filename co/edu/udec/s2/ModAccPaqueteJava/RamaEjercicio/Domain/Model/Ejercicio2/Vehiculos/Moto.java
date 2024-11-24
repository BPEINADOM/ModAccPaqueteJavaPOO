package Domain.Model.Ejercicio2.Vehiculos;

public class Moto extends Vehiculo {
    String marca;

    public Moto(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }

}
