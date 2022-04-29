package abril29.modelo;

public class PaqueteEnvio {
    // campo
    public int numEnvio;
    public String origen;
    public String destino;

    public PaqueteEnvio() {

    }
    public PaqueteEnvio(int numEnvio,String origen,String destino) {
        this.numEnvio=numEnvio;
        this.origen=origen;
        this.destino=destino;
    }
}
