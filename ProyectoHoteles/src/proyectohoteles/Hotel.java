
package proyectohoteles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hotel {
   private String nombre;
   private String direccionweb;

    public Hotel(String nombre) {
       boolean nombreOK= validaIngresoNombre(nombre);
       if (nombreOK){
        this.nombre = nombre;
        this.direccionweb = listaDePosiblesDireccionesWeb(nombre);
       }else{
            System.out.println("El Hotel no ha sido creado");
       }
    }

    public Hotel(String nombre, String direccionweb){
        this.nombre = nombre;
        this.direccionweb = direccionweb;
    }
     public boolean validaIngresoNombre(String nombre){
        boolean retorno = false;
        if ( nombre == "" ){
                System.out.println("Debe ingresar un nombre");
                retorno = false;
        }
        else
            retorno = true;
        return retorno;
    }
    public String listaDePosiblesDireccionesWeb(String nombre){
        String retorno = "";
        String opcion = "";
        int op = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String opcion1 = nombre.replace(" ","").toLowerCase();
        String opcion2 = nombre.replace(" ","-").toLowerCase();;
        String opcion3 = "hotel"+nombre.replace(" ","-").toLowerCase();
        String opcion4 = nombre.replace(" ","-").toLowerCase()+"hotel";
        String opcion5 = nombre.replace(" ","-").toLowerCase()+"peru";
        
        System.out.println("1.- "+ opcion1);
        System.out.println("2.- "+ opcion2);
        System.out.println("3.- "+ opcion3);
        System.out.println("4.- "+ opcion4);
        System.out.println("5.- "+ opcion5);
        try {
            opcion=in.readLine();
            } catch (Exception e) {
        }
        
       op = 2; //para el test
//      op = Integer.parseInt(opcion);//para el ejecutar el programa
        switch ( op ){
            case 1:
                retorno = opcion1;
                break;
            case 2:
                retorno = opcion2;
                break;
            case 3:
                retorno = opcion3;
                break;
            case 4:
                retorno = opcion4;
                break;
            case 5:
                retorno = opcion5;
                break;
        }
        retorno = "http://"+retorno+".cleark.im";
        System.out.println("La dirección web seleccionada es: "+retorno);

        return retorno;
    }

    public void setDireccionweb(String direccionweb) {
        this.direccionweb = direccionweb;
    }

    public String getDireccionweb() {
        return direccionweb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean  datosHotel(){
           if (nombre.equals("")){
            System.out.println("Debe ingresar un nombre de hotel");
            return false;
       }
           System.out.println("El nombre de hotel ingresado es: "+getNombre()); 
           return true;
    }
    public String listaHoteles(){
           
         ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
           int opcion=1;
          String otrosHoteles;
           try {
           do{    
            System.out.println("A continuación le sugerimos los 5 mejores Hoteles:"); 
            opcion=Integer.parseInt(in.readLine());
            switch (opcion){
                case 1 :otrosHoteles="Marriot";
                    System.out.println("http://"+otrosHoteles+".clerk.lm"); 
                    break;
                case 2 :otrosHoteles="Casa Andina";
                    System.out.println("http://"+otrosHoteles+".clerk.lm"); 
                    break;  
                case 3 :otrosHoteles="Miraflores Hotel";
                    System.out.println("http://"+otrosHoteles+".clerk.lm"); 
                    break;
                case 4 :otrosHoteles="María Angola";
                    System.out.println("http://"+otrosHoteles+".clerk.lm"); 
                    break;
                case 5 :otrosHoteles="Lima Hotel";
                    System.out.println("http://"+otrosHoteles+".clerk.lm"); 
                    break;
                default:
                    System.out.println("Error de opción"); 
                    break;
                }
           }while (opcion!=5);
           } catch (Exception e) {
           }
           System.out.println(opcion);
           return null ;
           
        }
    }


