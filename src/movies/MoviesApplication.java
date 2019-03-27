package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {



   static public int menu(){
        Input input = new Input();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the  drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in sci-fi category");
    return input.getInt(0,5, "Enter your choice: ");
    }




    public static void main(String[] args) {
       Movie[] allMovies = MoviesArray.findAll();
       boolean keepGoing = true;
        Input input = new Input();

        while(keepGoing) {
           switch (menu()) {
               case 0:
                   System.out.println("Goodbye");
                   break;
               case 1:
                   for (Movie movie : allMovies) {
                       System.out.println(movie.getName());
                   }
               case 2:
                   for (Movie movie : allMovies) {
                       if (movie.getCategory().equals("animated"))
                           System.out.println(movie.getName());
                   }
               case 3:
                   for (Movie movie : allMovies) {
                       if (movie.getCategory().equals("drama"))
                           System.out.println(movie.getName());
                   }
               case 4:
                   for (Movie movie : allMovies) {
                       if (movie.getCategory().equals("horror"))
                           System.out.println(movie.getName());
                   }
               case 5:
                   for (Movie movie : allMovies) {
                       if (movie.getCategory().equals("sci-fi"))
                           System.out.println(movie.getName());
                   }
           }
           keepGoing = input.yesNo("Would you like to continue?");
       }
    }
}
