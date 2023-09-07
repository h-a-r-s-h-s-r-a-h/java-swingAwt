package lecture4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.nextLine().charAt(0);
        switch(grade){
            default:
            System.out.println("Invalid Grade");
            break;
            case 'A':
            System.out.println("Scholarship= 20000");
            break;
            case 'B':
            System.out.println("Scholarship= 10000");
            break;
            case 'C':
            System.out.println("No ScholarShip");
            break;
            
        }
        sc.close();
    }
}
