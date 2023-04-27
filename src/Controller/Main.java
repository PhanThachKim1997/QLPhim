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
        //In toàn bộ danh sách film
        for (Movie movie : movies){
            System.out.println(movie);
            System.out.println("-----------");
        }
        //Nhập phim muốn quản lý
        System.out.println("Nhập keyword tìm kiếm: ");
        String keyword = sc.nextLine();
        int i=1;
        for (Movie movie: movies){
            if(findMovie.findMovie(keyword,movie)){
                System.out.println(i+"/ "+movie.getNameMovie()+" _ "+movie.getProduction().getNameProd());
                i+=1;
            }else {
                System.out.println("Không tìm thấy film.");
            }
        }
        System.out.println("Nhập stt phim muốn thao tác: ");
        int n = Integer.parseInt(sc.nextLine());
        Movie edit = movies.get(n-1);

        //So sánh giá vé nhập vào
        System.out.println("Nhập giá vé muốn so sánh: ");
        int check = Integer.parseInt(sc.nextLine());
        if(checkPriceTicket.checkPriceTicket(edit,check)){
            System.out.println("Giá nhập mắc hơn giá vé");
        }else {
            System.out.println("Giá nhập rẻ hơn giá vé");
        }

        //In tên nhà sản xuất
        System.out.print("Tên nhà sản xuất của phim "+edit.getNameMovie()+" là: ");
        System.out.println(outputNameProduct.outputNameProduct(edit));

        //giá vé của phim khi có khuyến mãi
        System.out.println("Nhập % muốn khuyến mãi: ");
        int sale = Integer.parseInt(sc.nextLine());
        double aftersale = edit.getPriceTicket()- edit.getPriceTicket()*sale/100;
        System.out.println("Giá vé sau khi giảm là: "+aftersale);
    }
}
