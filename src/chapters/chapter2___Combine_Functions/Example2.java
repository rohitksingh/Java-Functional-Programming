package chapters.chapter2___Combine_Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//Return movies from 2002 to 2005 in comedy genre
public class Example2 {

    public static void main(String[] args) {

        List<Movie> movies = getAllMovies();

        //Todo: Learn concepts and apply here


    }


    public static List<Movie> getAllMovies(){

        Movie a = new Movie("A", 2000, Genre.HORROR);
        Movie b = new Movie("B", 2010, Genre.COMEDY);
        Movie c = new Movie("C", 2007, Genre.COMEDY);
        Movie d = new Movie("D", 2005, Genre.SCIFI);
        Movie e = new Movie("E", 1992, Genre.HORROR);
        Movie f = new Movie("F", 1972, Genre.COMEDY);

        List<Movie> movies = new ArrayList<>();
        movies.add(a);
        movies.add(b);
        movies.add(c);
        movies.add(d);
        movies.add(e);
        movies.add(f);
        return movies;

    }



    private static class Movie{

        String name;
        int releaseDate;
        Genre genre;

        public Movie(String name, int releaseDate, Genre genre){
            this.name = name;
            this.releaseDate = releaseDate;
            this.genre = genre;
        }

    }

    enum Genre{
        COMEDY, HORROR, DRAMA, SCIFI;
    }
}



