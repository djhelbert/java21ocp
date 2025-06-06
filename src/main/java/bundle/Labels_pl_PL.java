package bundle;

import java.util.ListResourceBundle;

/**
 * Unlike a properties file, the values do not have to be a string.
 */
public class Labels_pl_PL extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"hello", "hey"},
                {"good", "guten"},
                {"error", "ach"}
        };
    }
}
