package src;
public class Switch2{

    public static void daysInMonth(String month){
        
        switch (month) {
            case "1":
                System.out.println("28 Days");
            break;
            case "2":
                System.out.println("30 Days");
            break;
            case "3":
                System.out.println("30 Days");
            break;
            case "4":
                System.out.println("30 Days");
            break;
            case "5":
                System.out.println("30 Days");
            break;
            case "6":
                System.out.println("31 Days");
            break;
            case "7":
                System.out.println("31 Days");
            break;
            case "8":
                System.out.println("31 Days");
            break;
            case "9":
                System.out.println("31 Days");
            break;
            case "10":
                System.out.println("31 Days");
            break;
            case "11":
                System.out.println("31 Days");
            break;
            case "12":
                System.out.println("31 Days");
            break;
            default:
                System.out.println("This month does not exist!");
            break;
        }

    }

}