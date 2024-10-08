import org.example.MediaDigitos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.Media;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaTeste {
    private MediaDigitos numero;
    @BeforeEach
    public void setUp(){
        numero=new MediaDigitos();
    }
    @Test
    public void testarMedia(){
        assertEquals(4,numero.mediaDosDigitos(44) );
        assertEquals(3,numero.mediaDosDigitos(12));
    }
}
