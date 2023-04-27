package Controller;

import Model.Movie;
import Model.Production;

public class outputNameProduct {
    public static String outputNameProduct(Movie movie){
        return movie.getProduction().getNameProd();
    }
}
