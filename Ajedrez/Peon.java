public class Peon extends Pieza{

    public Peon(String color, int posx, int posy) {
        super(color, posx, posy);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void moverAyuda() {
        System.out.println("El peon puede mover 1 vez hacia adelante o diagonalmente adelante");
    }

    @Override
    public String getSimbolo() {
        // TODO Auto-generated method stub
        return "P";
    }
    
}
