package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringrotationTest {

    @Test
    void testCheckRotation() {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        boolean result = Stringrotation.checkRotation(s1, s2);

        assertTrue(result);
    }
}
