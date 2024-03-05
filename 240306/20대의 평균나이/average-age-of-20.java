import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> ages = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            ages.add(input);
        }


        int sum = 0;
        int count = 0;
        for(int age : ages){
            if(age < 20 || age >= 30){
                break;
            }
                sum += age;
                count++;
        }


        double average = (double) sum / count;

        System.out.printf("%.2f", average);

        scanner.close(); 
    }
}