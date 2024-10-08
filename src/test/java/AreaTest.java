import org.example.Area;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {
    @Test
    public void testArea() {
        Area areazinha=new Area();
        assertEquals(15,areazinha.calcularArea(3,5));
        assertEquals(40,areazinha.calcularArea(8,5));
        assertEquals(8,areazinha.calcularArea(2,4));
    }
    public void testPerimetro() {
        Area perimetrozinho=new Area();
        assertEquals(15,perimetrozinho.calcularComp(3,5));
        assertEquals(40,perimetrozinho.calcularComp(8,5));
        assertEquals(8,perimetrozinho.calcularComp(2,4));
    }
    @Test
    public void testIsTriangle() {
        Area triangulo = new Area();
        assertTrue(triangulo.isTriangle(3, 4, 5));  // Triângulo válido
        assertFalse(triangulo.isTriangle(1, 2, 3)); // Não é um triângulo
        assertTrue(triangulo.isTriangle(5, 5, 8));  // Triângulo válido
    }

}
