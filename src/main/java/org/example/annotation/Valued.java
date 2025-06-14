package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Has a value that can be set without a name. e.g. @Valued("new value")
 */
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.CLASS)
public @interface Valued {
    public String value() default "default";  // Not required
    public static int zero = 0;               // public static by default
}
