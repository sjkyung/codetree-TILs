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
            if(age >= 30){
                break;
            }
                sum += age;
                count++;
        }


        double average = count > 0 ? (double) sum / count : 0.00;
        String formattedAverage = String.format("%.2f", average);
        System.out.print(formattedAverage);

        scanner.close(); 
    }
}