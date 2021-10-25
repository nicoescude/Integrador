public class Caballo extends Pieza{

    public Caballo(String color, int posx, int posy) {
        super(color, posx, posy);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void moverAyuda() {
        // TODO Auto-generated method stub
        System.out.println("El caballo mueve en forma de L");
    }

    @Override
    public String getSimbolo() {
        // TODO Auto-generated method stub
        return "C";
    }
    
}
