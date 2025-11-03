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
        for ( int i = 0; i < inputArray1.length; i++) {
            sum += inputArray1[i];
            if (inputArray1[i] > max) {
                max = inputArray1 [i];
            }
            if (inputArray1 [i] < min) {
                min = inputArray1 [i];
            }
        }
        average = (double) sum / inputArray1.length;
        outputArray1 [0] = sum;
        outputArray1 [1] = max;
        outputArray1 [2] = min;
        outputArray1 [3] = average;

        System.out.println("Входной массив (inputArray1):");
        for (int i = 0; i < inputArray1.length; i++) {
            if (i < inputArray1.length - 1) {
                System.out.print(inputArray1[i] + ", ");
            } else {
                System.out.print(inputArray1[i]);
            }
        }

        System.out.println("\nРезультирующий массив (outputArray1):");
        for (int i = 0; i < outputArray1.length; i++) {
            if (i < outputArray1.length -1) {
                System.out.print(outputArray1[i] + ", ");
            } else {
                System.out.print(outputArray1 [i]);
            }
        }

        //Задача 2
        System.out.println("\n\nЗадача 2:");
        int [] inputArray2 = {13500, 4000, 3200, 8450, 92800};
        double [] outputArray2 = new double [inputArray2.length];

        double texRate = 0.13;

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2 [i] = inputArray2 [i] * texRate;
        }

        System.out.println("Входной массив (inputArray2):");
        for (int i = 0; i < inputArray2.length; i++) {
            if (i < inputArray2.length - 1) {
                System.out.print(inputArray2[i] + ", ");
            } else {
                System.out.print(inputArray2[i]);
            }
        }
        System.out.println("\nРезультирующий массив (outputArray1):");
        for (int i = 0; i < outputArray2.length; i++) {
            if (i < outputArray2.length - 1) {
                System.out.print(outputArray2 [i] + ", ");
            } else {
                System.out.print(outputArray2 [i]);
            }
        }

        //Задача 3
        System.out.println("\n\nЗадача 3:");
        int [] inputArray3 = {8909, 9722, 31, 3341, 6478};
        boolean [] outputArray3 = new boolean [inputArray3.length];

        for (int i = 0; i < inputArray3.length; i++) {
            if ( inputArray3 [i] > 5000) {
                outputArray3 [i] = true;
            } else {
                outputArray3 [i] = false;
            }
        }
        System.out.println("Входной массив (inputArray3):");
            for (int i = 0; i < inputArray3.length; i++) {
                if (i < inputArray3.length - 1) {
                System.out.print(inputArray3[i] + ", ");
                } else {
                System.out.print(inputArray3[i]);
                }
            }
        System.out.println("\nРезультирующий массив (outputArray3):");
            for ( int i = 0; i < outputArray3.length; i++) {
                if (i < outputArray3.length - 1) {
                    System.out.print(outputArray3[i] + ", ");
                } else {
                    System.out.print(outputArray3[i]);
                }
            }

        //Задача 4
        System.out.println("\n\nЗадача 4:");
        int [] inputArray4 = {5000, -3000, 1200, 800, 2000};
        boolean [] outputArray4 = new boolean[1];
         boolean negativeElement = true;
            for (int i = 0; i < inputArray4.length; i++) {
                if (inputArray4[i] < 0) {
                    negativeElement = false;
                    break;
                }
            }
         outputArray4[0] = negativeElement;
        System.out.println("Входной массив (inputArray4):");
        for (int i = 0; i < inputArray4.length; i++) {
            if (i < inputArray4.length - 1) {
                System.out.print(inputArray4[i] + ", ");
            } else {
                System.out.print(inputArray4[i]);
            }
        }
        System.out.println("\nРезультирующий массив (outputArray4):");
        System.out.println(outputArray4[0]);

        //Задача 5
        System.out.println("\n\nЗадача 5:");
        int[] inputArray5 = {120000, -50000, 0, -250000, 175000};
        int[] outputArray5 = new int[1];
        int profitableMonths = 0;
                for (int i = 0; i < inputArray5.length; i++) {
                    if (inputArray5[i] > 0) {
                    profitableMonths++;
                    }
                }
        outputArray5[0] = profitableMonths;
        System.out.println("Входной массив (inputArray5):");
        for (int i = 0; i < inputArray5.length; i++) {
            if (i < inputArray5.length - 1) {
                System.out.print(inputArray5[i] + ", ");
            } else {
                System.out.print(inputArray5[i]);
            }
        }
        System.out.println("\nРезультирующий массив (outputArray5):");
        System.out.println("Количество прибыльных месяцев: " + outputArray5[0]);
    }
}