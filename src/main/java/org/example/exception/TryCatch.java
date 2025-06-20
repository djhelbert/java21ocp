package org.example.exception;

public class TryCatch {
    public static void main(String... args) {
        try {
            throwMyException(true);
        } catch(MyException exc) {   // must be ahead of excpetion
            exc.printStackTrace();
        } catch(Exception exc) {
            exc.printStackTrace();
        }
        finally {
            System.err.println("Finally"); // always executes
        }
    }

    private static void throwMyException(boolean thr) throws MyException {
        if(thr) {
            throw new MyException();
        }
    }

    private static void throwMyRuntimeException(boolean thr) throws MyException {
        if(thr) {
            throw new MyRuntimeException();
        }
    }
}
