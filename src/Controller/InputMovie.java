package Controller;

import Model.Movie;
import Model.Production;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
        LocalDate releaseDate;
        //Tùy chỉnh dạng format ngày tháng
        DateTimeFormatter format_gach = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true){
            try {
                System.out.println("Nhập vào công chiếu (dd-MM-yyyy): ");
                String inputDate = sc.nextLine();
                releaseDate = LocalDate.parse(inputDate,format_gach);
                    break;
            }catch (DateTimeParseException e){
                System.out.print("Ngày tháng không hợp lệ. Nhập lại: ");
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
