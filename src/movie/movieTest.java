package movie;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myMovieList = new movie();

        movieItem item1 = new movieItem("Inception", "Christopher Nolan");
        movieItem item2 = new movieItem("The Matrix", "Wachowskis");

        myMovieList.addmovieItem(item1);
        myMovieList.addmovieItem(item2);

        myMovieList.printmovieDetails();
    }
}
