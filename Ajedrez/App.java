

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        GameMaster gm = new GameMaster();

        gm.showTablero();
        gm.moverAyuda(0, 0);
        gm.moverAyuda(1, 1);
        gm.moverAyuda(1, 0);
    }

    
    
}
