import java.util.Stack;

public class Telefono {
    private String numero;
    private Agenda agenda;
    private Stack<Llamada> historialLlamadas;

    public Telefono(String numero){
        this.numero = numero;
        this.agenda = new Agenda();
        this.historialLlamadas = new Stack<>();
    }

    public void addContacto(String prefix, String nombre, String numero){
        this.getAgenda().addContacto(prefix, nombre, numero);
    }

    public void mostrarContacto(String nombre){
        Contacto c = this.getAgenda().buscar(nombre);
        System.out.println(c.getNumeroCompleto());
    }

    private Contacto buscarContacto(String nombre){
        return this.getAgenda().buscar(nombre);    
    }

    public void hacerLlamada(String nombre, int minutos){
        Contacto c = this.getAgenda().buscar(nombre);
        if (c!=null){
            System.out.println(">Llamando a: "+c.getNombre()+" con el num: "+c.getNumero());
            addLlamada(this.numero, c.getNumeroCompleto(), minutos);
            System.out.println(">Llamada finalizada luego de: "+minutos+" minutos.");
        }
        else{
            System.out.println("Error, contacto invalido.");
        }
    }

    public void mostrarContactos(){
        this.getAgenda().mostrarContactos();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public String getNumero() {
        return numero;
    }

    public String getUltimoNumeroLlamado() {
        return historialLlamadas.peek().getNumDestino();
    }

    private Llamada buscarLlamada(String nombre){
        Contacto c = buscarContacto(nombre);
        if (c==null) return null;
        String numDest = c.getNumeroCompleto();
        for (Llamada l : historialLlamadas){
            if (l.getNumDestino().equals(numDest))
                return l;
        }
        return null;
    }

    public void mostrarLlamada(String nombre){
        Llamada l = buscarLlamada(nombre);
        if (l != null){
            System.out.println("Destino: "+l.getNumDestino()+" - Minutos: "+l.getMinutos());    
        }
        else{
            System.out.println("No existen llamadas a ese contacto: ("+nombre+")");
        }
    }

    public int totalLlamadas(){
        int sum=0;
        for (Llamada l : historialLlamadas){
            sum+=l.getMinutos();
        }

        return sum;
    }

    private Llamada addLlamada(String origen, String destino, int minutos){
        Llamada l = new Llamada(origen, destino, minutos);
        this.historialLlamadas.add(l);
        return l;
    }
}
