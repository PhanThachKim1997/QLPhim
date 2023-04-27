package Controller;

import Model.Movie;

import java.util.ArrayList;

public class findMovie {
    public static boolean findMovie(String findValue, Movie movie){
        int yearProduced = 0, priceTicket = 0;
        try {
            yearProduced = Integer.parseInt(findValue);
            priceTicket = Integer.parseInt(findValue);
        } catch (NumberFormatException e) {
            // Không phải là số, tìm theo tên phim hoặc tên hãng sản xuất
            if (movie.getNameMovie().toLowerCase().contains(findValue.toLowerCase())) {
                    return true;
            }
            if (movie.getProduction().getNameProd().toLowerCase().contains(findValue.toLowerCase())) {
                    return true;
            }
        }
        // Tìm theo năm sản xuất hoặc giá vé
            if (movie.getYearProduced() == yearProduced) {
                return true;
            }
            if (movie.getPriceTicket() == priceTicket) {
                return true;
            }
        return false;
    }

}
