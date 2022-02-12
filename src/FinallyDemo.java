public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("At body of procA()");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("At finally procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("At body procB()");
            return;
        } finally {
            System.out.println("At procB finally");
        }
    }

    static void procC() {
        try {
            System.out.println("At body procC()");
        } finally {
            System.out.println("Ar finally procC()");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Is handled.");
        }
        procB();
        procC();
    }
}
