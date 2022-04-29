package abril29.modelo;

public class Envio {
    public String destinatario;
    public int peso;
    public int alto;
    public int ancho;
    public int largo;

    // constructor vacio
    public Envio() {

    }

    /**
     * Este es el constructor con envio (java doc)
     * @param destinatario
     * @param peso
     * @param alto
     * @param ancho
     * @param largo
     */
    public Envio(String destinatario, int peso,
          int alto, int ancho, int largo) {

        this.destinatario=destinatario;
        this.peso=peso;
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    } // fin del constructor envio

} // fin de la clase
