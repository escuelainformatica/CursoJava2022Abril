package ejercicio2;

public class Inicial {

    public static void main(String[] args) {
        int numero1=20;

        //System.out.println(numero1);
        System.out.println(numero1);    

        // fac = variable, objeto
        // una instancia de factura
        // fac es una factura
        Factura fac=new Factura();
        fac.numfactura=222;
        fac.cliente="pepsi";
        System.out.println(fac.numfactura);
        System.out.println(fac.cliente);


    }
    
}
