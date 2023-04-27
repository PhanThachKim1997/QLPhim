package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Movie {
    String nameMovie;
    int yearProduced;
    int priceTicket;
    LocalDate date;
    Production production;

    public Movie(String nameMovie, int yearProduced, int priceTicket, LocalDate date, Production production) {
        this.nameMovie = nameMovie;
        this.yearProduced = yearProduced;
        this.priceTicket = priceTicket;
        this.date = date;
        this.production = production;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return yearProduced == movie.yearProduced && priceTicket == movie.priceTicket && Objects.equals(nameMovie, movie.nameMovie) && Objects.equals(date, movie.date) && Objects.equals(production, movie.production);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMovie, yearProduced, priceTicket, date, production);
    }

    @Override
    public String toString() {
        return  "Tên Phim: " + nameMovie+
                "\nNăm sản xuất: " + yearProduced +
                "\nGiá vé = " + priceTicket +
                "\nNgày chiếu: " + date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                "\nNhà sản xuất: " + production.nameProd;
    }
}
