public class Tablero {
    
    protected int dimx;
    protected int dimy;
    protected Pieza[][] piezas;

    public Tablero(int x,int y){
        this.dimx = x;
        this.dimy = y;
        init();
    }

    private void init() {
        this.piezas = new Pieza[this.getDimx()][this.getDimy()];
    }

    public void addPieza(Pieza p){
        this.piezas[p.getPosx()][p.getPosy()] = p;
    }

    public void showTablero(){
        for (int i=0;i<this.getDimx();i++){
            for (int j=0;j<this.getDimy();j++){
                if (this.getPieza(j,i)!=null){
                    System.out.print(this.getPieza(j,i).getSimbolo()+" ");
                }
                    
                else
                    System.out.print("- ");
            }
            System.out.println("");
        }
    }

    public int getDimx() {
        return dimx;
    }

    public int getDimy() {
        return dimy;
    }

    public Pieza getPieza(int x, int y) {
        return piezas[x][y];
    }
}
