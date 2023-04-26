package Controller;

import Model.Movie;
import Model.Production;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputMovie {
    public static Movie inputMovie(){
        Scanner sc = new Scanner(System.in);
        //Nhập thông tin bộ phim
        System.out.println("Nhập vào tên bộ film: ");
        String nameMovie = sc.nextLine();
        System.out.println("Nhập vào năm sản xuất: ");
        int yearProduced = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào giá vé: ");
        int priceTicket = Integer.parseInt(sc.nextLine());

        //Nhập ngày công chiếu
        Date saveDate = new Date();
        System.out.println("Nhập vào công chiếu (dd/MM/yyyy): ");
        String releaseDate;
        while(true) {
            try {
                String inputDate = sc.nextLine();
                SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
                saveDate = formatDate.parse(inputDate);
                releaseDate = formatDate.format(saveDate);
                break;
            } catch (ParseException e) {
                System.out.println("Định dạng không đúng. Nhập lại: ");
            }
        }

        //Nhập tên nhà sản xuất
        System.out.println("Nhập tên nhà sản xuất: ");
        String nameProd = sc.nextLine();
        System.out.println("Nhập quốc gia sản xuất: ");
        String nation = sc.nextLine();

        Production production = new Production(nameProd,nation);
        Movie movie = new Movie(nameMovie,yearProduced,priceTicket,releaseDate,production);

        return movie;
    }
    public static boolean stopInput(String check){
        return check.equalsIgnoreCase("Y");
    }
}
