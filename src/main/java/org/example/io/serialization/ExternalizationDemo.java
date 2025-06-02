package org.example.io.serialization;

import java.io.*;
import java.util.logging.Logger;

public class ExternalizationDemo {
    private static Logger logger = Logger.getLogger("org.example.io.externalization");

    public static void main(String[] args) {
        User user = new User("nickname", "password");
        var byteArrayOutputStream = serializeUser(user);
        User copyUser = deserializeUser(byteArrayOutputStream);
        System.out.println(copyUser);
    }

    private static ByteArrayOutputStream serializeUser(User empl) {
        try (var baos = new ByteArrayOutputStream(); var oos = new ObjectOutputStream(baos)) {
            oos.writeObject(empl);
            return baos;
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
        return null;
    }

    private static User deserializeUser(ByteArrayOutputStream inputStream) {
        try (var ois = new ObjectInputStream(new ByteArrayInputStream(inputStream.toByteArray()))) {
            return (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            logger.severe(e.getMessage());
        }
        return null;
    }
}
