import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //Задача 1
        System.out.println("Задача 1:");
        int [] inputArray1 = {13500, 4000, 3200, 8450, 92800};
        double [] outputArray1 = new double [4];
            int sum = 0;
            int max = inputArray1 [0];
            int min = inputArray1 [0];
            double average = 0;

        for (int valut : inputArray1) {
            sum += valut;
            if (valut > max) max = valut;
            if (valut < min) min = valut;
        }
        average = (double) sum / inputArray1.length;
        outputArray1 [0] = sum;
        outputArray1 [1] = max;
        outputArray1 [2] = min;
        outputArray1 [3] = average;

        System.out.println("Входной массив (inputArray1): \n" + Arrays.toString(inputArray1));
        System.out.println("Результирующий массив (outputArray1): \n" + Arrays.toString(outputArray1));

        //Задача 2
        System.out.println("\nЗадача 2:");
        int [] inputArray2 = {13500, 4000, 3200, 8450, 92800};
        double [] outputArray2 = new double [inputArray2.length];

            double texRate = 0.13;
            int index = 0;

        for (int value : inputArray2) {
            outputArray2[index++] = value * texRate;
        }
        System.out.println("Входной массив (inputArray2): \n" + Arrays.toString(inputArray2));
        System.out.println("Результирующий массив (outputArray2): \n" + Arrays.toString(outputArray2));



        //Задача 3
        System.out.println("\nЗадача 3:");
        int [] inputArray3 = {8909, 9722, 31, 3341, 6478};
        boolean [] outputArray3 = new boolean [inputArray3.length];
            index = 0;

        for (int value : inputArray3) {
            outputArray3 [index++] = value > 5000;
        }

        System.out.println("Входной массив (inputArray2): \n" + Arrays.toString(inputArray3));
        System.out.println("Результирующий массив (outputArray2): \n" + Arrays.toString(outputArray3));

        //Задача 4
        System.out.println("\nЗадача 4:");
        int [] inputArray4 = {5000, -3000, 1200, 800, 2000};
        boolean [] outputArray4 = new boolean[1];
            boolean negativeElement = true;

            for (int value : inputArray4) {
                if (value < 0) {
                    negativeElement = false;
                    break;
                }
            }
            outputArray4[0] = negativeElement;
        System.out.println("Входной массив (inputArray4): \n" + Arrays.toString(inputArray4));
        System.out.println("Результирующий массив (outputArray4): \n" + Arrays.toString(outputArray4));


        //Задача 5
        System.out.println("\nЗадача 5:");
        int[] inputArray5 = {120000, -50000, 0, -250000, 175000};
        int[] outputArray5 = new int[1];
        int profitableMonths = 0;
                for (int value : inputArray5) {
                    if (value > 0) profitableMonths++;
                }
        outputArray5[0] = profitableMonths;
        System.out.println("Входной массив (inputArray5): \n" + Arrays.toString(inputArray5));
        System.out.println("Результирующий массив (outputArray5): \n" + Arrays.toString(outputArray5));

    }
}