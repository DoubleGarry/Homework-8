import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] cells = new int[3];

        double[] cells2 = {1.57, 7.654, 9.986};

        int[] weight = {100, 101, 104, 98};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] cells = new int[3];
        cells[0] = 1;
        cells[1] = 2;
        cells[2] = 3;
        System.out.print(cells[0] + ", ");
        System.out.print(cells[1] + ", ");
        System.out.print(cells[2]);
        System.out.println();

        double[] cells2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(cells2));
        System.out.println();

        int[] weight = {100, 101, 104, 98};
        System.out.print(weight[0] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[2] + ", ");
        System.out.print(weight[3] + ".");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] cells = new int[3];
        cells[0] = 1;
        cells[1] = 2;
        cells[2] = 3;
        System.out.print(cells[2] + ", ");
        System.out.print(cells[1] + ", ");
        System.out.print(cells[0]);
        System.out.println();

        double[] cells2 = {1.57, 7.654, 9.986};
        System.out.print(cells2[2] + ", ");
        System.out.print(cells2[1] + ", ");
        System.out.print(cells2[0]);
        System.out.println();

        int[] weight = {100, 101, 104, 98};
        System.out.print(weight[3] + ", ");
        System.out.print(weight[2] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[0] + ".");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] cells = new int[3];
        cells[0] = 1;
        cells[1] = 2;
        cells[2] = 3;
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] % 2 != 0) {
                cells[i] = cells[i] + 1;
            }
            System.out.println(cells[i]);
        }
    }
}