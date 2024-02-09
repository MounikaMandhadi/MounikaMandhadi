package threads;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingletonInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertSame("Singleton instances are not the same", singleton1, singleton2);
    }
}
