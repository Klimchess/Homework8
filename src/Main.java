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
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        {
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
        }
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        double[] numbers = {1.57, 7.654, 9.986};

        //Произвольный массив. Тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        long[] mounts = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L};
    }

    public static void task2() {
        System.out.println("Задача 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        {
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        }
        System.out.println();
        {
            double[] numbers = {1.57, 7.654, 9.986};
            System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        }
        System.out.println();
        {
            long[] mounts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            System.out.print(mounts[1] + ", " + mounts[2] + ", " + mounts[3] + ", " + mounts[4] + ", " + mounts[5] + ", " + mounts[6] + ", " + mounts[7] + ", " + mounts[8] + ", " + mounts[9] + ", " + mounts[10] + ", " + mounts[11]);
        }

    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        {
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            System.out.print(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        }

        System.out.println();
        double[] numbers = {1.57, 7.654, 9.986};
        System.out.print(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);

        System.out.println();

        long[] mounts = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L};
        System.out.print(mounts[11] + ", " + mounts[10] + ", " + mounts[9] + ", " + mounts[8] + ", " + mounts[7] + ", " + mounts[6] + ", " + mounts[5] + ", " + mounts[4] + ", " + mounts[3] + ", " + mounts[2] + ", " + mounts[1]);
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i] + 1);
            }
        }



    }
}




