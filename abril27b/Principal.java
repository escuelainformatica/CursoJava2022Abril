package abril27b;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import abril27b.modelo.Compra;



// import abril27b.modelo.Compra;

public class Principal {
    public static void main(String[] args) {
        // variables primitiva
        int entero=20;
        double decimal=20.4;
        boolean booleano=true;
        String texto="hola"; // String es una clase.

        // variable de objeto
        Compra compra1=new Compra();
        System.out.println(compra1.producto);
        System.out.println(compra1.cantidad);
        System.out.println(compra1.precio);

        Compra compra2 = new Compra();
        System.out.println(compra2.producto);
        
        Date fecha=new Date();

        // arreglos.
        // arreglos de paises.
        String pais1="Chile";
        String pais2="Argentina";
        String pais3="Peru";

        String[] paises=new String[3]; // desde el 0 hasta el 2.
        paises[0]="Chile";
        paises[1]="Argentina";
        paises[2]="Peru";

        // list Vector<>, Stack<>, Dictionary<>
        List<String> paises2=new ArrayList<>();
        paises2.add("Chile");
        paises2.add("Argentina");
        paises2.add("Peru");

        

        // List<String> = generics.  < > = parantesis (diamante)
        // < > se usa para especificar el o los tipos de valores.

        Compra c1=new Compra();
        c1.producto="cocacola";
        c1.cantidad=100;
        c1.precio=6000;

        Compra c2=new Compra();
        c2.producto="fanta";
        c2.cantidad=50;
        c2.precio=8000;

        Compra c3=new Compra();
        c3.producto="sprite";
        c3.cantidad=50;
        c3.precio=12000;

        // lista de compras llamada listadoCompras
        List<Compra> listadoCompras=new ArrayList<>();
        listadoCompras.add(c1);
        listadoCompras.add(c2);
        listadoCompras.add(c3);

        System.out.println("El primer producto se llama:");
        // si escribo sout y presiono tab.
        System.out.println(listadoCompras.get(0).producto);
        

       
    }
}
