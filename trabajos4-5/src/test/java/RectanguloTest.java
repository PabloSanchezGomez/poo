
import com.mycompany.trabajos4.Rectangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectanguloTest {
    Rectangulo r,r2;
        
    public RectanguloTest() {
        r = new Rectangulo();
        r = new Rectangulo(2,5);
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    @Test
    public void testBase(){
        assertEquals("1",1,r.base());
    }
    @Test
    public void testBase2(){
        assertEquals("10",10,r2.base());
    }

    private void assertEquals(String string, int i, int base) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
