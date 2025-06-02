package org.example.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {

    private String user;
    private String password;

    public User() {
    }

    public User(String u, String p) {
        this.user = u;
        this.password = p;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.user);
        out.writeObject("1234"); // we can encrypt password here
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.user = (String) in.readObject();
        this.password = (String) in.readObject(); // we can decrypt password here
    }

    @Override
    public String toString() {
        return "User [username=" + user + ", password=" + password + "]";
    }
}