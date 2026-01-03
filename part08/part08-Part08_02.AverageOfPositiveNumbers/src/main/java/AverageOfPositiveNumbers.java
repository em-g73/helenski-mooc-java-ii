
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                sum += input;
                num ++;
            }
        }
        
        if (sum == 0 || num == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / num;
            System.out.println(average);
        }
    }
}
