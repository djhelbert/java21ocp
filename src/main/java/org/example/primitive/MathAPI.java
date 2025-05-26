package org.example.primitive;

import static java.lang.Math.*;   // Static import of Math methods
import static org.example.Util.*; // Static import of utility class methods

public class MathAPI {
    public static void main(String[] args) {
        print(PI);
        print(E);

        int rand = (int)round(random() * 100.0);
        print(rand);
        print(min(1,2));
        print(max(1,2));
        print(max(1.1,2.2));
        print(sqrt(100));

        int radius = 5;
        double area = PI * pow(radius, 2);

        print("The area of the circle is: " + area);

        double number = 5.6;
        double roundedValue = round(number);
        double floorValue = floor(number);
        double ceilValue = ceil(number);

        print("Value   : " + number);
        print("Rounded : " + roundedValue);
        print("Floor   : " + floorValue);
        print("Ceil    : " + ceilValue);
    }
}
