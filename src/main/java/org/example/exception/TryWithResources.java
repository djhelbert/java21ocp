package org.example.exception;

public class TryWithResources {
    public static void main(String... args) {
        try(MyResource mr = new MyResource()) {
            throwMyException(true);
        } catch(MyException exc) {   // resource is closed before catch block executes
            exc.printStackTrace();
        } catch(Exception exc) {
            exc.printStackTrace();
        }
        finally {
            System.out.println("Finally"); // always executes
        }
        System.out.println("Done");
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