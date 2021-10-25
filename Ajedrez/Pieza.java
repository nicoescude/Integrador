public abstract class Pieza implements IMovementStrat{
    private String color;
    private int posx;
    private int posy;

    public enum Color{
        BLANCA("BLANCA"),NEGRA("NEGRA");
        private String color;
        private Color(String s){ this.color = s; }
        public String value(){ return this.color; }
    }

    public Pieza(String color,int posx, int posy){
        this.posx = posx;
        this.posy = posy;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public abstract String getSimbolo();
        
}
