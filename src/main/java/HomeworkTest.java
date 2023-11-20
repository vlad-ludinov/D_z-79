import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class HomeworkTest {

    Homework hw;

    @BeforeEach
    void beforeTest() {
        hw = new Homework();
    }

    @Test
    void testEvenOddNumber() {
        assertTrue(hw.evenOddNumber(10));
        assertFalse(hw.evenOddNumber(9));
    }

    @Test
    void testNumberInInterval() {
        assertTrue(hw.numberInInterval(30));
        assertFalse(hw.numberInInterval(20));
        assertFalse(hw.numberInInterval(120));
    }
}
