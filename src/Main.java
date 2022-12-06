import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }

        for (int x = 0; x < dataPoints.length; x++) {
            System.out.printf("%5d", dataPoints[x]);
        }
        System.out.println(" ");

        for (int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " | ");
        }
        System.out.println(" ");

        int sum = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            sum = sum + dataPoints[x];
        }
        int ave = sum / dataPoints.length;

        System.out.println("The sum of the data is: " + sum);
        System.out.println("The average of the data is: " + ave);

        int num = 0;
        num = SafeInput.getRangedInt(in, "Input a value", 1, 100);

        boolean foundTarget = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == num) {
                foundTarget = true;
                System.out.println("Found " + num + " at position " + x);
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + num + " not found.");
        }


        int num2 = 0;
        num2 = SafeInput.getRangedInt(in, "Input a value", 1, 100);

        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == num2) {
                foundTarget = true;
                System.out.println("Found " + num2 + " at position " + x);
                break;
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + num2 + " not found.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int x = 0; x < dataPoints.length; x++) {
            if(min > dataPoints[x]) {
                min = dataPoints[x];
            }
            if(max < dataPoints[x]) {
                max = dataPoints[x];
            }
        }
        System.out.println(" ");
        System.out.println("The min is " + min + " and the max is " + max);
        System.out.println(" ");
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]){
        int sum = 0;
        for (int x = 0; x < values.length; x++) {
            sum = sum + values[x];
        }
        int ave = sum / values.length;

        return ave;
    }
}
