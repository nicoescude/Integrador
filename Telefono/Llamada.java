public class Llamada {
    private String numOrigen;
    private String numDestino;
    private int minutos;

    public Llamada (String origen, String destino, int minutos){
        this.numOrigen = origen;
        this.numDestino = destino;
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public String getNumOrigen() {
        return numOrigen;
    }
}
