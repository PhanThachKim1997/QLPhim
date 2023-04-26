package Controller;

import Model.Movie;

public class checkPriceTicket {
    public boolean checkPriceTicket(Movie movie1, Movie movie2){
        return movie1.getPriceTicket()<movie2.getPriceTicket();
    }
}
