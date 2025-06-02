package org.example.generic;

public class Rating {
    public static Rating NOT_RATED = new Rating(null);

    private String stars;

    public Rating(String stars) {
        this.stars = stars;
    }
}
