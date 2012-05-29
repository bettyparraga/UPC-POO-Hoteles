

package proyectohoteles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaTest {
     Cuenta login = new Cuenta("Betty Párraga","bparraga@hotmail.com","12","12");
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    @Test
    public void clienteDebeTenerNombre() {
        assertNotNull(login.getNombre());
    }
    @Test
    public void clienteDebeTenerEmail() {
        assertNotNull(login.getEmail());
    }
     @Test
     public void validarElNombreDelCliente(){
        //Cliente cliente = new Cliente("");
        if (login.validaNombre()){
        System.out.println("El nombre del cliente ingresado es: "+login.getNombre());
        //System.out.println("**---DEBE INGRESAR DATOS CLIENTE--**");
        //assertEquals("", cliente.getNombre());
         }
     }
      @Test
     public void validarElEmail(){
        //Cliente cliente = new Cliente("");
        if (login.validaEmail()){
        System.out.println("Correo electronico:"+login.getEmail());
        //System.out.println("**---DEBE INGRESAR DATOS CLIENTE--**");
        //assertEquals("", cliente.getNombre());
         }
     }
    @Test
    public void clienteDebeTenerClave1() {
        assertNotNull(login.getClave1());
    }
    @Test
    public void clienteDebeTenerConfirmacionDeClave() {
        assertNotNull(login.getClave2());
    }
     /*@Test
     public void validaClave1DelCliente(){
        //Cliente cliente = new Cliente("");
        if (cliente.validaClaves()){
        System.out.println("El password del cliente es: "+cliente.getClave1());
        //System.out.println("**---DEBE INGRESAR DATOS CLIENTE--**");
        //assertEquals("", cliente.getNombre());
         }
     }
  @Test
     public void confirmarLaClaveDelCliente(){
        //Cliente cliente = new Cliente("");
        if (cliente.confirmaClave1()){
        System.out.println("El ingreso de conformación de la clave es: "+cliente.getClave2());
        //System.out.println("**---DEBE INGRESAR DATOS CLIENTE--**");
        //assertEquals("", cliente.getNombre());
         }
     }*/
   @Test
     public void validaClaves(){
        if (login.validaClaves()){
        System.out.println("El password ingresado es: "+login.getClave1());
        if (login.confirmaClave1()){
        System.out.println("El ingreso de conformación de la clave fue: "+login.getClave2());

         }
       }
    }
    @Test
    public void cuandoClaveEsCorrectaMuestraListaHotelesSugeridos(){
    login.setHoteles("CLERK HOTEL");
        if (login.confirmaClave1())    
        System.out.println(login.datosHotel());
        System.out.println(login.listaHoteles());
        //assertSame(mensajeEsperado, mensajeRecibido);

    }
    
 /*@Test
    public void cuandoClaveEsCorrectaMuestraListaHotelesSugeridos(){
    login.setHoteles("CLERK HOTEL");
    String mensajeEsperado = "A continuación le sugerimos los siguientes Hoteles:"
                + "01-Marriot-Peru // "
                + "02-Casa Andina"
                + "03-Suites Hotel"
                + "04-MiraLista Sugerida de Hoteles:flores Hotel"
                + "05-Maria Angola";
         //String mensajeRecibido = login.listaHoteles();
         if (login.confirmaClave1())    
        // System.out.println(login.listaHoteles());
        System.out.println(login.datosHotel());
         //assertSame(mensajeEsperado, mensajeRecibido);

    }*/
}