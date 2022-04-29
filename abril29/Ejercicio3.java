package abril29;

import java.util.ArrayList;
import java.util.List;

import abril29.modelo.Envio;
import abril29.modelo.PaqueteEnvio;

public class Ejercicio3 {
    
    public static void main(String[] args) {

        // aqui usamos el constructor vacio
        Envio envio1=new Envio();
        envio1.destinatario="john";
        envio1.peso=12;
        envio1.alto=5;
        envio1.ancho=3;
        envio1.largo=3;

        // 1) un campo es una variable
        // 2) un argumento es usado en una funcion
        //   para indicar los valores que nosotros
        //   les entregamos a la funcion.

        // quiero cocinar una pizza?
        // masa, queso, jamon, etc. <-- argumentos.
        // pizza <-- retorno.
        // cuando tengo una funcion, se refiere a un verbo
        // public Pizza cocinarPizza(Masa masa,Queso queso, Jamon jamon) { }


        // aqui usamos el constructor con argumentos
        Envio envio1b=new Envio("john",
            12,5,3,3);

        System.out.println("El destinatario :"+envio1.destinatario);
        System.out.println("El peso es :"+envio1.peso);

        // segundo ejercicio
        PaqueteEnvio paq1=new PaqueteEnvio(22,"Santiago","Arica");
        PaqueteEnvio paq2=new PaqueteEnvio(24,"Puerto Montt","Valdivia");

        List<PaqueteEnvio> paquetes=new ArrayList<>();
        paquetes.add(paq1);
        paquetes.add(paq2);

        System.out.println("El origen del segundo envio es : "+paquetes.get(1).origen);


    }

}
