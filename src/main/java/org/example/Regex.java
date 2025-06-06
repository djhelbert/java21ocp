package org.example;

import static org.example.Util.print;

/**
 Repeaters ( , +, and { } ) These symbols act as repeaters and tell the computer that the preceding character is to be used for more than just one time.

 1. The asterisk symbol ( ) It tells the computer to match the preceding character (or set of characters) for 0 or more times (upto infinite).
 2. The Plus symbol ( + ) It tells the computer to repeat the preceding character (or set of characters) at least one or more times(up to infinite).
 3. The curly braces { … }
 It tells the computer to repeat the preceding character (or set of characters) for as many times as the value inside this bracket.
 4. Wildcard ( . )
 The dot symbol can take the place of any other symbol, that is why it is called the wildcard character.
 5. Optional character ( ? )
 This symbol tells the computer that the preceding character may or may not be present in the string to be matched.
 6. The caret ( ^ ) symbol ( Setting position for the match )
 The caret symbol tells the computer that the match must start at the beginning of the string or line.
 7.  The dollar ( $ ) symbol
 It tells the computer that the match must occur at the end of the string or before \n at the end of the line or string.

 [ABCDEFGHIJKLMNOPQRSTUVWXYZ] you may use  [A-Z] similarly with lower case letters from a to z you may use the character class [a-z].
 For numbers you may use [0-9] instead of [0123456789]

 As discussed above \d is used to match numbers 0 to 9. \D is used to match anything but numbers 0 to 9.
 \w matches word characters which include a to z upper and lower case, 0 to 9 and underscore.
 \W matches anything but \w
 \s matches whitespace like space, tab etc.
 \S matches all but \s

 .* is going to select any number of characters.

 For one or more repetition + is used. + metacharacter will match only if the character or group before + occurs atleast once,
 however it will match any additional occurences.

 \d+ will match one digit up to any digit number. \d is the shorthand character class for 0-9 and + means one or more repetition.
 \d+ is going to match all numbers in the text string.
*/
public class Regex {
    public static void main(String[] args) {
        var text = "This is the first sentence. Then the next one. And finally a third!";
        print(text.split("[.!]+"));
        print(text.split("the"));
    }
}
