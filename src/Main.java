import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] height = new int[3];
        height[0] = 1;
        height[1] = 2;
        height[2] = 3;

        float[] width = {1.57f, 7.654f, 9.986f};

        int[] weight = {15, 20, 25, 30, 35, 45, 50, 55, 0};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] height = {1, 2, 3};
        System.out.println(Arrays.toString(height));
        float[] width = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(width));
        int[] weight = {15, 20, 25, 30, 35, 45, 50, 55, 0};
        System.out.println(Arrays.toString(weight));
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] height = {1, 2, 3};
        float[] width = {1.57f, 7.654f, 9.986f};
        int[] weight = {15, 20, 25, 30, 35, 45, 50, 55, 0};

        for (int i = height.length - 1; i >= 0; i--) {
            System.out.print(height[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = width.length - 1; i >= 0; i--) {
            System.out.print(width[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] height = {1, 2, 3};
        for (int i = 0; i < height.length; i++){
            if (height[i] % 2 != 0){
                height[i] += 1;
            }
        }

        System.out.println(Arrays.toString(height));
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int[] arr = generateRandomArray();
        int minimum = 0;
        int maximum = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] < arr[index + 1]) {
                minimum = arr[index];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей." +
                " Максимальная сумма трат за день составила " + maximum + " рублей");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int[] arr = generateRandomArray();
        double averageAmount = 0;
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        averageAmount = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}