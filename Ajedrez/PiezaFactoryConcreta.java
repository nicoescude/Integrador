public class PiezaFactoryConcreta implements IPiezaFactory{

    @Override
    public Pieza create(String tipo, String color, int posx, int posy) {
        switch(tipo.toUpperCase()){
            case "PEON":
                return new Peon(color,posx,posy);
            case "ALFIL":
                return new Alfil(color, posx, posy);
            case "TORRE":
                return new Torre(color, posx, posy);
            case "REY":
                return new Rey(color, posx, posy);
            case "REINA":
                return new Reina(color, posx, posy);
            case "CABALLO":
                return new Caballo(color, posx, posy);
        }
        return null;
    }
    
}
