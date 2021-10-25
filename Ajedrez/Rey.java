public class Rey extends Pieza{

    public Rey(String color, int posx, int posy) {
        super(color, posx, posy);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void moverAyuda() {
        // TODO Auto-generated method stub
        System.out.println("El rey mueve 1 casilla hacia cualquier lado");
    }

    @Override
    public String getSimbolo() {
        // TODO Auto-generated method stub
        return "R";
    }
    
}
