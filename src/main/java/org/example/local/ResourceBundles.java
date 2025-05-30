package org.example.local;

import static org.example.Util.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {
    public static void main(String args[]) {
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("CA").build();
        ResourceBundle bundle = ResourceBundle.getBundle("bundle/Labels", locale);
        print(bundle.getString("hello"));
        print(bundle.getString("error"));

        locale = Locale.US;
        bundle = ResourceBundle.getBundle("bundle/Labels", locale);
        print(bundle.getString("hello"));
        print(bundle.getString("error"));

        locale = new Locale.Builder().setLanguage("pl").setRegion("PL").build();
        bundle = ResourceBundle.getBundle("bundle.Labels", locale);
        print(bundle.getString("hello"));
        print(bundle.getString("error"));
    }
}
