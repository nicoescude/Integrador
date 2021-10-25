public class Torre extends Pieza{

    public Torre(String color, int posx, int posy) {
        super(color, posx, posy);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void moverAyuda() {
        // TODO Auto-generated method stub
        System.out.println("La torre puede mover recto en 4 direcciones");
    }

    @Override
    public String getSimbolo() {
        // TODO Auto-generated method stub
        return "T";
    }
    
}
