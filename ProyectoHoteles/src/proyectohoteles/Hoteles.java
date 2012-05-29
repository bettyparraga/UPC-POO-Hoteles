/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectohoteles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author u11949
 */
public class Hoteles {
   private String nombre;
   private String lista;
   private String direccionweb;
   //private String pais;

    public Hoteles() {
        //this.nombre = nombre;
        // this.pais = pais;
    }
    public Hoteles(String nombre) {
        this.nombre = nombre;
       // this.pais = pais;
    }
    
    public Hoteles(String nombre, String direccionweb){
        this.nombre = nombre;
        this.direccionweb = direccionweb;
    }

    public void setDireccionweb(String direccionweb) {
        this.direccionweb = direccionweb;
    }

    public String getDireccionweb() {
        return direccionweb;
    }

    public String getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public String getPais() {
        return pais;
    }*/


    public boolean  datosHotel(){
           if (nombre.equals("")){
            System.out.println("Debe ingresar un nombre de hotel");
            return false;
       }
           System.out.println("El nombre de hotel ingresado es: "+getNombre()); 
           return true;
    }
    public String listaHoteles(){
           
         ArrayList<Hoteles> hoteles = new ArrayList<Hoteles>();
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
       
                /*+ "01-Marriot-Peru // "
                + "02-Casa Andina"
                + "03-Suites Hotel"
                + "04-MiraLista Sugerida de Hoteles:flores Hotel"
                + "05-Maria Angola";
                //return*/
    
  
    }


