package proyectohoteles;

import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaTest {

    @Test
    public void cuentaDebeTenerEmail() {
        Cuenta cuenta = new Cuenta("jcruzac@hotmail.com");
        assertNotNull(cuenta.getEmail());
    }
    @Test
    public void cuentaDebeTenerClave() {
        Cuenta cuenta = new Cuenta("jcruzac@hotmail.com","clavedecuenta");
        assertNotNull(cuenta.getClave());
    }
    @Test
    public void cuentaDebeTenerHotel() {
        Cuenta cuenta = new Cuenta("jcruzac@hotmail.com","clave","Hotel Clerk");
        assertNotNull(cuenta.getHotel().getNombre());
    }
    @Test
    public void cuentaDebeSerCreadaConParametrosCorrectos() {
//       Hotel hotel = new Hotel("Betty Parraga");
       Cuenta cuenta = new Cuenta("jcruzac@hotmail.com","clavedecuenta","clavedecuenta","betty parraga","SI");
       assertNotNull(cuenta.getHotel().getNombre());
    }
    @Test
    public void contraseñaDebeIngresarseDosVeces() {
        Cuenta cuenta = new Cuenta("jcruzac@hotmail.com");
        assertEquals(cuenta.validaIngresoDeClave("t", "t"), true);
    }
    
    @Test
    public void contraseñaDebeSeriguales() {
        Cuenta cuenta = new Cuenta("jcruzac@hotmail.com");
        assertEquals(cuenta.validaClavesIguales("x", "x"), true);
    }
    
    @Test
    public void validacionDeclavesIngresadas() {
        Cuenta cuenta = new Cuenta("jcruzac@hotmail.com");
        assertEquals(cuenta.validaClave("w", "w"), true);
    }
}