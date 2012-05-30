package proyectohoteles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class HotelTest {
    @Test
    public void hotelDebeTenerNombre(){
        Hotel hotel = new Hotel("Hotel Clerk");
        assertNotNull(hotel.getNombre());
    }      
    @Test
    public void hotelDebeTenerDireccionWeb(){
        Hotel hotel = new Hotel("Hotel Clerk","http://hotelclerk.cleark.im");
        assertNotNull(hotel.getDireccionweb());
    }
    @Test
    public void direccionWebdeHotel(){
        Hotel hotel = new Hotel("betty parraga");
        assertEquals(hotel.getDireccionweb(),"http://betty-parraga.cleark.im");
    }
}