import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda(){
        this.contactos = new ArrayList<>();
    }

    public void addContacto(String nombre, String numero){
        this.contactos.add(new Contacto("+54 011", numero, nombre));
    }

    public void addContacto(String prefix, String nombre, String numero){
        this.contactos.add(new Contacto(prefix, numero, nombre));
    }

    public void quitarContacto(String nombre){
        for (Contacto c : this.contactos){
            if (c.getNombre().equals(nombre)){
                this.contactos.remove(c);
                System.out.println("Contacto removido");
                break;
            }
        }
    }

    public void quitarContactoPorNum(String numero){
        for (Contacto c : this.contactos){
            if (c.getNumero().equals(numero)){
                this.contactos.remove(c);
                System.out.println("Contacto removido");
                break;
            }
        }
    }

    public Contacto buscar(String nombre){
        for (Contacto c: this.contactos){
            if (c.getNombre().equals(nombre))
                return c;
        }
        return null;
    }

    public void mostrarContactos() {
        System.out.println("Contactos: "+this.contactos.size());
        for (Contacto c : this.contactos){
            System.out.println("\tNombre: "+c.getNombre()+" - Numero: "+c.getNumero());
        }
    }
}
