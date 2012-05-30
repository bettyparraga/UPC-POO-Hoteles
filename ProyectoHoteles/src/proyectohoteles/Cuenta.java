package proyectohoteles;

public class Cuenta {
        private String email;
        private String clave;
        private Hotel hotel;

    public Cuenta(String email){
        this.email = email;
    }

    public Cuenta(String email, String clave){
        this.clave = clave;
        this.email = email;
    }
    public Cuenta(String email, String clave, String hotel){
        this.email = email;
        this.clave = clave;
        this.hotel = new Hotel(hotel);
    }

    public Cuenta(String email,String clave, String reclave, String hotel,String aceptacondiciones){
        boolean emailOK;
        boolean emailValidoOK;
        boolean claveOK;
        boolean hotelOK;
        boolean aceptacondicionOK;
        
        emailOK = validaIngresoEmail(email);
        emailValidoOK = emailValido(email);
        claveOK = validaClave(clave,reclave);
        aceptacondicionOK = validaAceptaCondicion(aceptacondiciones);
        
        if ( emailOK && emailValidoOK && claveOK && aceptacondicionOK ){
            this.email = email;
            this.clave = clave;
            this.hotel = new Hotel(hotel);
            System.out.println("\nCuenta creada exitosamente. Tiene 24 horas \npara confirmar la recepción del e-mail");
        }
        else{
            System.out.println("La cuenta no ha sido creada");
        }
    }
    
    public boolean validaAceptaCondicion(String aceptaciondiciones){
        boolean retorno = false;
        if ( aceptaciondiciones == "NO" ){
                System.out.println("Debe aceptar las condiciones");
                retorno = false;
        }
        else
            retorno = true;
        return retorno;
    }
    public boolean validaIngresoEmail(String email){
        boolean retorno = false;
        if ( email == "" ){
                System.out.println("Debe ingresar correo");
                retorno = false;
        }
        else
            retorno = true;
        return retorno;
    }

    public boolean emailValido(String email){
        boolean retorno = false;
                retorno = true; //hasta encontrar forma de reconocer email válido
        return retorno;
    }
    
    public boolean validaClave(String clave, String reclave){
        boolean retorno = true;
        boolean validaIngreso = validaIngresoDeClave(clave, reclave);
        boolean validaIgualdad;// = validaClavesIguales(clave, reclave);
        if ( validaIngreso ){
            validaIgualdad = validaClavesIguales(clave, reclave);
            if ( validaIgualdad )
                retorno = true;
            else
                retorno = false;
        }
        else
            retorno = false;
        return retorno;
    }
    
    public boolean validaIngresoDeClave(String clave, String reclave){
        boolean retorno = false;
        if (clave == "" || reclave == ""){
                System.out.println("Debe ingresar contraseña");
                retorno = false;
        }
        else
            retorno = true;
        return retorno;
    }
    public boolean validaClavesIguales(String clave, String reclave){
        boolean retorno = false;
        if ( clave != reclave ){
                System.out.println("Las contraseñas no coinciden");
                retorno = false;
        }
        else
            retorno = true;
        return retorno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHotel(String nombre){
        this.hotel = new Hotel (nombre);
    }
    public Hotel getHotel(){
        return this.hotel;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}