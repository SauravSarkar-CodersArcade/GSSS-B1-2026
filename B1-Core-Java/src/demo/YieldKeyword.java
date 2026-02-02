package demo;
import java.util.Scanner;
public class YieldKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String typeOfDay = switch (day){
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> {
                if(day.isEmpty()){
                    yield "Sorry! No data given!";
                }else {
                    yield "Invalid Data";
                }
            }
        };
        System.out.println("Type of day is: " + typeOfDay);
    }
}
