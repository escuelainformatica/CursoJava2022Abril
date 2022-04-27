package abril27b.modelo;



// modelo

public class Compra {
    // campos
    public String producto;
    public int cantidad;
    public int precio;


    public void funcionejemplo() {
        // variable
        int producto2=0;

        System.out.println(producto);
        System.out.println(producto2);

    }
    public void function2() {
        int producto=20;

        System.out.println(producto+this.producto);
        System.out.println(this.producto); // explicito, usando el campo.
        // System.out.println(producto2);
    }
}
