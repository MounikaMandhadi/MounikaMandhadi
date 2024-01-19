package objectarrays;

import java.util.*;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getProfit() {
        return collectionAmount - budget;
    }

    public static Comparator<Movie> byRatingAndProfit() {
        return Comparator
                .comparing(Movie::getRating, Comparator.reverseOrder())
                .thenComparing(Movie::getProfit, Comparator.reverseOrder());
    }

    public static Comparator<Movie> byYearAndRating() {
        return Comparator
                .comparingInt(Movie::getYearReleased)
                .thenComparing(Movie::getRating, Comparator.reverseOrder());
    }

    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie(2020, 8.5, 10000000, 20000000),
            new Movie(2019, 7.9, 8000000, 15000000),
            new Movie(2021, 9.0, 12000000, 25000000)
        );

        // Sort by Rating and Profit
        movies.sort(byRatingAndProfit());
        System.out.println("Sorted by Rating and Profit:");
        movies.forEach(movie -> System.out.println("Year: " + movie.getYearReleased() + ", Rating: " + movie.getRating() + ", Profit: " + movie.getProfit()));

        // Sort by Year and Rating
        movies.sort(byYearAndRating());
        System.out.println("\nSorted by Year and Rating:");
        movies.forEach(movie -> System.out.println("Year: " + movie.getYearReleased() + ", Rating: " + movie.getRating() + ", Profit: " + movie.getProfit()));
    }
}
