package bundle;

import java.util.ListResourceBundle;

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
