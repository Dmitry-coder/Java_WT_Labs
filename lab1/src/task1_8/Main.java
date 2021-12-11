package task1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие:\nВыбрать задачу (ввести 1-8)\nВыйти (ввести 0)");
        boolean exit = false;
        while (!exit) {
            while (!scan.hasNextInt()) {
                System.out.println("Выберите действие:");
                scan.next();
            }
            int press = scan.nextInt();
            switch (press) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    task1();
                case 2:
                    task2();
                case 3:
                    task3();
                case 4:
                    task4();
                case 5:
                    task5();
                case 6:
                    task6();
                case 7:
                    task7();
                case 8:
                    task8();
            }
        }
    }
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Х:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Х:");
            scan.next();
        }
        double x = scan.nextDouble();
        System.out.println("Введите Y:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Y:");
            scan.next();
        }
        double y = scan.nextDouble();
        double f = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2*x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
        System.out.println(f);
    }
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Х:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Х:");
            scan.next();
        }
        double x = scan.nextDouble();
        System.out.println("Введите Y:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Y:");
            scan.next();
        }
        double y = scan.nextDouble();
        boolean popal = false;
        if (y <= 5 && y > 0) {
            if (x >= -4 && x <= 4) {
                popal = true;
            } else {
                popal = false;
            }
        } else {
            if (y <= 0 && y >= -3) {
                if (x >= -6 && x <= 6) {
                    popal = true;
                } else {
                    popal = false;
                }
            } else popal = false;
        }
        System.out.println(popal);
    }
    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Х:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Х:");
            scan.next();
        }
        double x = scan.nextDouble();
        System.out.println("Введите H:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите H:");
            scan.next();
        }
        double h = scan.nextDouble();
        System.out.println("Введите A:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите A:");
            scan.next();
        }
        double a = scan.nextDouble();
        System.out.println("Введите B:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите B:");
            scan.next();
        }
        double b = scan.nextDouble();
        double f;
        while (x <= b) {
            if (x < a) {
                x += h;
            } else {
                f = Math.tan(x);
                System.out.printf("|%10f|%10f|\n", x, f);
                x += h;
            }
        }
    }
    public static void task4() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 3) {
                System.out.println(arr[i]);
                continue;
            }
            double s = Math.sqrt(arr[i]);
            for (int j = 2; j <= s; j++) {
                if (arr[i] % j != 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void task5() {
        int[] arr = {1,2,3,7,5,4,9,8,14,11,15,16};
        int max = arr[0];
        int k = 0;
        int j = 1;
        int[] ost = new int[arr.length];
        ost[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ost[j] = arr[i];
                j++;
            } else {
                k++;
            }
        }
        System.out.println(k);
    }
    public static void task6() {
        int n = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int buf = i;
            for (int j = 0; j < n; j++) {
                if (buf == 10) {
                    buf = 0;
                }
                matrix[i][j] = arr[buf];
                buf++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void task7() {
        int n = 10;
        int[] mass = {1,7,3,9,4,11,2,23,5,6};
        int i, j, step;
        int tmp;
        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {
                tmp = mass[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < mass[j - step])
                        mass[j] = mass[j - step];
                    else
                        break;
                }
                mass[j] = tmp;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
    }
    public static void task8() {
        double[] firstSequence = {2,4,5,7,10};
        double[] secSequence = {4,6,8};
        array(getPlacesToInsert(firstSequence, secSequence));
    }

    public static void array(int array[]) {
        for (int number : array ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] getPlacesToInsert(double[] a, double[] b) {
        int[] placesToInsert = new int[b.length];
        double[] mergedArray = mergeArrays(a, b);
        Arrays.sort(mergedArray);
        double stub = mergedArray[0] - 1;

        for (int i = 0; i < b.length; i++) {
            int j = 0;
            while (j < mergedArray.length) {
                if (b[i] == mergedArray[j]) {
                    mergedArray[j] = stub;
                    placesToInsert[i] = j;
                    j = mergedArray.length;
                }
                j++;
            }
        }
        return placesToInsert;
    }

    private static double[] mergeArrays(double[] array1, double[] array2) {
        double[] result = new double[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}
/*
        ArrayList<Integer> a = new ArrayList();
        int n = 5;
        int newSize = 0;
        a.add(0,2);
        a.add(1,4);
        a.add(2,5);
        a.add(3,7);
        a.add(4,10);
        int[] b = {4,6,8};
        int buf;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.size(); j++) {
                //buf = (int) a.get(j);
                if ((int) a.get(j) <= b[i]) {
                    a.add(j + 1, b[i]);
                    //newSize++;
                }
            }
        }
        System.out.print(a.toArray());
        a.toArray();
         */