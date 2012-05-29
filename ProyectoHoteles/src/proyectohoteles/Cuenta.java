
package proyectohoteles;

public class Cuenta {
    
        private String nombre;
        private String clave1;
        private String clave2;
        private String email;
        private Hoteles hoteles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHoteles(String nombre){
        this.hoteles = new Hoteles (nombre);
    }
    public Hoteles getHoteles(){
    return this.hoteles;

    }

    public String getClave2() {
        return clave2;
    }

    public void setClave2(String clave2) {
        this.clave2 = clave2;
    }

    public String getClave1() {
        return clave1;
    }

    public void setClave1(String clave1) {
        this.clave1 = clave1;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//  private Reserva reserva;

    public Cuenta(String nombre,String email,String clave1,String clave2){
        this.nombre = nombre;
        this.clave1 = clave1;
        this.clave2 = clave2;
        this.email = email;

   }
   
    public  boolean validaNombre(){
            if (nombre.equals("")){
            System.out.println("Debe ingresar un Nombre");
            return false;
       }
            return true;
    }

    public  boolean validaEmail(){
            if (email.equals("")){
            System.out.println("Debe ingresar un correo electronico");
            return false;
       }
            return true;
    }

    public boolean validaClaves(){ //boolean
            //if ((clave1==0)||(clave1!=clave1)){
            //if (clave1==0){
            if (clave1.equals("") || clave2.equals("")){
            System.out.println("Claves y/o confirmación no pueden estar vacias");
            return false;
            }

            return true;

    }
    public boolean confirmaClave1(){ //boolean
        //if ((clave2==0)||(clave1!=clave2)){    
            if (clave2.equals(clave1)){
           // System.out.println("Cuenta creada exitosamente");//Confirmación password correcto
            }
            if (clave2!=clave1){
                System.out.println("Password incorrecto");
                return false;
            }
             System.out.println("Cuenta creada exitosamente");//Confirmación password correcto
            return true;
    }
    public boolean datosHotel() {
        return  hoteles.datosHotel();
         
           
  }
    public String listaHoteles() {
    return hoteles.listaHoteles();//"Le mostramos una lista de 5 hoteles sugeridos";
}
}

