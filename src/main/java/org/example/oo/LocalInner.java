package org.example.oo;

import java.util.ArrayList;
import java.util.List;

public class LocalInner {
    interface Local {
        public void doStuff(); // public by default
    }

    int innerCount = 0;

    public LocalInner() {
        int localCnt = 0;

        class Inner {
            Inner() {
                innerCount++;
            }
        }

        List<Inner> list = new ArrayList<>();
        list.add(new Inner());

        Local l = new Local() {
            @Override
            public void doStuff() { // method cannot be protected or default
                innerCount++;
                // localCnt++; must be final or effectively final
            }
        };
        l.doStuff();

        Local lam = () -> {
            innerCount++;
            System.out.println("Lambda");
            // localCnt++; does not compile
            return;
        };

        lam.doStuff();
    }

    public static void main(String[] args) {
        LocalInner li = new LocalInner();
        System.out.println(li.innerCount);
    }
}
