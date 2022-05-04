package ejercicio3;

import ejercicio3.modelo.Vehiculo;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Vehiculo auto1=new Vehiculo();
        auto1.nombre="Nissan";
        auto1.patente="aa-ff-33";
        auto1.precio=25;

        Vehiculo auto2=new Vehiculo("Toyota",35,"dd-ee-ff");

        // autocompletar = puedo presionar control+espacio
        Vehiculo auto3=new Vehiculo("Mazda","aa-ff-44");

        // sout System.out.println

        System.out.println("El primer vehiculo es "+auto1.nombre+" y la patente es "+auto1.patente+"\n"
        +"El segundo vehiculo es "+auto2.nombre+" y la patente es "+auto2.patente);

        //System.out.println("El segundo vehiculo es "+auto2.nombre+" y la patente es "+auto2.patente);
        //System.out.println("El tercer vehiculo es "+auto3.nombre+" y la patente es "+auto3.patente);

            
    } // aqui termina funcion main
} // aqui termina la clase
