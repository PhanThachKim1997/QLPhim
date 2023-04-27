package Controller;

import Model.Movie;

public class checkPriceTicket {
    public static boolean checkPriceTicket(Movie movie, int check){
        return movie.getPriceTicket()<check;
    }
}
