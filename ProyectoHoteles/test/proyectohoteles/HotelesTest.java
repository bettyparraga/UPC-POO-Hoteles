/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohoteles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author USUARIO
 */
public class HotelesTest {
    @Test
    public void detalleDeListaSugerida(){
      Hoteles otrosHoteles = new Hoteles("CLERK HOTEL");
        assertNotNull(otrosHoteles.listaHoteles());
    } 
            
     
}