public class GameMaster {
    private Tablero tablero;
    private String turno;
    private IMovementStrat movementStrat;
    
    public GameMaster(){
        ITableroFactory factory = new TableroFactoryConcreta();
        this.tablero = factory.create(8, 8);
        this.turno = Pieza.Color.BLANCA.value();
    }

    public void moverAyuda(int x, int y){
        Pieza p = this.getTablero().getPieza(x, y);
        if (p == null){
            System.out.println("Error, no hay una pieza en esa posición");
        }
        else{
            if (p.getColor().equals(getTurno())){
                this.setMovementStrat(p);
                this.getMovementStrat().moverAyuda();
            }
        }
    }

    public void showTablero(){
        this.getTablero().showTablero();
    }

    public IMovementStrat getMovementStrat() {
        return movementStrat;
    }

    public void setMovementStrat(IMovementStrat movementStrat) {
        this.movementStrat = movementStrat;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public String getTurno() {
        return turno;
    }
}
