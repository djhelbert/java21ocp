package org.example.generic;

@FunctionalInterface
public interface Rateable<T> {
    public final static Rating DEFAULT_RATING = Rating.NOT_RATED;

    public abstract T applyRating(Rating r);

    public default Rating getDefaultRating() {
        return DEFAULT_RATING;
    }
}
