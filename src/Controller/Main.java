package Controller;

import Model.Movie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies= new ArrayList<>();;
        while (true) {
            System.out.println("Nhập và một bộ film------");
            movies.add(InputMovie.inputMovie());
            System.out.print("Bạn có muốn nhập thêm bộ film không? (Y/N): ");
            String check = sc.nextLine();
            if (!InputMovie.stopInput(check))
                break;
        }
        for (Movie movie : movies){
            System.out.println(movie);
        }
    }
}
