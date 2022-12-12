import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
}