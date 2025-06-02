package org.example.primitive;

public class TextBlocks {
    public static void main(String[] args) {
        String block = """
                  This line of text has
                multiple lines
                of text.
                """;
        String block2 = """
                This line of text has \
                multiple "lines" of text.
                """;

        System.out.println(block);  // The first line has indentation of 2
        System.out.println(block2); // The first line continues to line 2 with slash
        System.out.println("This is a formatted %s.".formatted("string"));
    }
}
