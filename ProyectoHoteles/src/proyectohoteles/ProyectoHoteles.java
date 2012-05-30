package proyectohoteles;

public class ProyectoHoteles {

    public static void main(String[] args) {
        //Para crear un objeto cuenta
        //se invoca al constructor con
        //los parámetros
        //email
        //clave
        //reclave
        //hotel
        //aceptacondicion
        String email = "jcruzac";
        String clave = "miclave";
        String reclave = "miclave";
        String hotel = "All in Olivos";
        String aceptaCondiciones = "SI";
        
        Cuenta cuenta = new Cuenta(email,clave,reclave,hotel,aceptaCondiciones);
        
    }
}
