public class TableroFactoryConcreta implements ITableroFactory {

    @Override
    public Tablero create(int x, int y) {
        Tablero tablero = new Tablero(x, y);
        IPiezaFactory piezaFactory = new PiezaFactoryConcreta();
        for (int i=0;i<tablero.getDimx();i++){
            tablero.addPieza(piezaFactory.create("Peon", Pieza.Color.BLANCA.value(), i, 1));
            tablero.addPieza(piezaFactory.create("Peon", Pieza.Color.NEGRA.value(), i , tablero.getDimy()-2));
            tablero.addPieza(piezaFactory.create("Torre", Pieza.Color.BLANCA.value() , 0 , 0));
            tablero.addPieza(piezaFactory.create("Caballo", Pieza.Color.BLANCA.value() , 1 , 0));
            tablero.addPieza(piezaFactory.create("Torre", Pieza.Color.BLANCA.value() , tablero.getDimx()-1 , tablero.getDimy()-1));
            tablero.addPieza(piezaFactory.create("Caballo", Pieza.Color.BLANCA.value() , tablero.getDimx()-2 , tablero.getDimy()-1));
            tablero.addPieza(piezaFactory.create("Torre", Pieza.Color.BLANCA.value() , 0 , tablero.getDimy()-1));
            tablero.addPieza(piezaFactory.create("Caballo", Pieza.Color.BLANCA.value() , 1 , tablero.getDimy()-1));
            tablero.addPieza(piezaFactory.create("Torre", Pieza.Color.BLANCA.value() , tablero.getDimx()-1 , 0));
            tablero.addPieza(piezaFactory.create("Caballo", Pieza.Color.BLANCA.value() , tablero.getDimx()-2 , 0));
            /**
             * Ingresar resto de piezas 
             */
        }
        
        return tablero;
    }
    
}
