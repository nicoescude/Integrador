public class Reina extends Pieza{

    public Reina(String color, int posx, int posy) {
        super(color, posx, posy);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void moverAyuda() {
        // TODO Auto-generated method stub
        System.out.println("La reina puede mover hacia cualquier dirección en linea recta / diagonal");
    }

    @Override
    public String getSimbolo() {
        // TODO Auto-generated method stub
        return "Q";
    }
    
}
