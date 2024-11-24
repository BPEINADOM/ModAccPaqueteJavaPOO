package Domain.Model.Ejercicio2.Vehiculos;

public class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
    }

}
