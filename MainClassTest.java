import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();

        if (14 == a) {
            System.out.println("It is OK");
        } else {
            System.out.println("It looks like it is no 14");
        }
    }
}
