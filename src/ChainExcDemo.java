public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Top level");
        e.initCause(new ArithmeticException("cause"));
       throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Handled exception: " + e);
            System.out.println("Reason: " + e.getCause());
        }
    }
}
