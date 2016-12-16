import java.util.Scanner;
public class SelectionSort {

    static final int SIZE = 10;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[SIZE];

        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

        selectionSort(numbers);
        printArray(numbers, 10);
    }

    public static void selectionSort(double[] numbers) {

        for (int i = numbers.length - 1; i > 1 ; i--) {
            int currentIndex = i;
            double currentHigh = numbers[i];

            for (int k = i - 1; k > 0; k--) {
                if (currentHigh < numbers[k]) {
                    currentIndex = k; // save new high index
                    currentHigh = numbers[k];
                }
            }

            // if currentIndex changed swap
            if (currentIndex != i) {
                double temp = numbers[currentIndex];
                numbers[currentIndex] = numbers[i];
                numbers[i] = temp;
            }
        }
    }

    public static void printArray(double[] array, int numberPerLine) {

            for (int i = 0; i < array.length; i++) {

                System.out.printf("%5.2f ", array[i]);
                if ((i + 1) % numberPerLine == 0) System.out.println("");
            }
    }
}