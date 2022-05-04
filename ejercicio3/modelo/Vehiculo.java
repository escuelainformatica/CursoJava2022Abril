package ejercicio3.modelo;

public class Vehiculo {
    public String nombre;
    public int precio;
    public String patente;

    // constructor vacio
    public Vehiculo() {

    }

    public Vehiculo(String nombre,int precio,String patente) {
        // this.nombre = el campo nombre.
        // nombre = argumento nombre.
        this.nombre=nombre;
        this.precio=precio;
        this.patente=patente;
    }
    public Vehiculo(String nombre,String patente) {
        this.nombre=nombre;
        this.patente=patente;
        this.precio=20;
    }
    
}
