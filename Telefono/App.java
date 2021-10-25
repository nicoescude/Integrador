public class App {
    public static void main(String[] args) throws Exception {
        Telefono tel = new Telefono("2262-445566");
        tel.mostrarContactos();
        tel.addContacto("+54 2262","Luis", "44556213");
        tel.addContacto("+54 0223","Rodrigo", "48678541");
        tel.addContacto("+54 0223","Maria", "655285655");

        tel.mostrarContactos();

        tel.hacerLlamada("Luis", 20);
        tel.hacerLlamada("Rodrigo", 15);

        tel.mostrarContacto("Luis");

        tel.mostrarLlamada("Luis");
        tel.mostrarLlamada("Marias");

        
        System.out.println(tel.totalLlamadas()+ " minutos.");

        System.out.println(tel.getUltimoNumeroLlamado());        
    }
}
