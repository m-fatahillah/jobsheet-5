import java.util.Scanner;

public class PemilihanHariIf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayNumber, dayType;

        System.out.print("input day number : ");
        dayNumber = sc.nextLine();
    
        switch (dayNumber.toLowerCase()) {

        case "1":
        case "2":
        case "3":
        case "4":
        case "5": 
            dayType = "weekday";
            break;  
        case "6":
        case "7":
            dayType = "weekend";
            break;  
        default:
            dayType = "invalid day name";
    }
    System.out.println(dayNumber + " is a " + dayType);
    sc.close();
        
    }
    
}
