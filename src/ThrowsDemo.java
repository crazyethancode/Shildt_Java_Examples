import java.util.IllformedLocaleException;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("At body of method throwOne().");
        throw  new IllegalAccessException("demonstration");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception: " + e);
        }
    }
}
