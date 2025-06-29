import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testName() {
        Person p = new Person("Veena", 25);
        assertEquals("Veena", p.getName());
        assertNotEquals("Lakshmanan", p.getName());
    }

    @Test
    public void testAge() {
        Person p = new Person("Veena", 25);
        assertTrue(p.getAge() > 20);
        assertFalse(p.getAge() < 18);
    }

    @Test
    public void testIsAdult() {
        Person p = new Person("Veena", 25);
        assertTrue(p.isAdult());

        Person teenager = new Person("Lakshmanan", 16);
        assertFalse(teenager.isAdult());
    }

    @Test
    public void testNullNickname() {
        Person p = new Person("Veena", 25);
        assertNull(p.getNickName());
    }
}
