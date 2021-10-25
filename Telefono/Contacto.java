public class Contacto {
    private String numero;
    private String nombre;
    private String prefix;

    public Contacto(String prefix, String numero, String nombre){
        this.prefix = prefix;
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getNumeroCompleto(){
        return this.prefix+"-"+this.numero;
    }
}
