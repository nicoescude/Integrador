public class Alfil extends Pieza{

    public Alfil(String color, int posx, int posy) {
        super(color, posx, posy);
        //TODO Auto-generated constructor stub
    }


    public void moverAyuda() {
        System.out.println("El alfil puede mover diagonalmente indefinidamente");
    }

    @Override
    public String getSimbolo() {
        // TODO Auto-generated method stub
        return "A";
    }
    
}
