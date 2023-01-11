import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        /*Объявите три массива:
         * Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
         * Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
         * Произвольный массив. Тип и количество данных определите сами.
         * Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
         */

        System.out.println("\nЗадача_1");
        int[] integer = new int[]{1, 2, 3};
        float[] floater = new float[]{1.57f, 7.654f, 9.986f};
        int[] random = new int[3];
    }

    public static void task2() {
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

        System.out.println("\nЗадача_2");
        int[] integer = new int[]{1, 2, 3};
        float[] floater = new float[]{1.57f, 7.654f, 9.986f};
        int[] random = new int[5];

        //певрый способ
         /*for (int i = 0; i <= 1; i++) {
            System.out.print(integer[i] + ", ");
        }
        System.out.print(integer[2]);
        System.out.println("");

        for (int i = 0; i <= 1; i++) {
            System.out.print(floater[i] + ", ");
        }
        ;
        System.out.print(floater[2]);
        System.out.println("");

        for (int i = 0; i <= 3; i++) {
            System.out.print(random[i] + ", ");
        }
        System.out.print(random[4]);
*/
        //второй способ

        /*System.out.println(Arrays.toString(integer));
        System.out.println(Arrays.toString(floater));
        System.out.println(Arrays.toString(random));
        */

        //третий способ

        for (int i = 0; i <= integer.length - 1; i++) {
            if (i == integer.length - 1) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ", ");
        }
        for (int i = 0; i <= floater.length - 1; i++) {
            if (i == floater.length - 1) {
                System.out.println(floater[i]);
                break;
            }
            System.out.print(floater[i] + ", ");
        }
        for (int i = 0; i<= random.length - 1; i++) {
            if (i == random.length-1) {
                System.out.println(random[i]);
                break;
            } System.out.print(random[i]+", ");
        }

    }



    public static void task3() {

        System.out.println("\nЗадача_3");
        int[] integer = new int[]{1, 2, 3};
        float[] floater = new float[]{1.57f, 7.654f, 9.986f};
        int[] random = new int[5];

        for (int i = integer.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(integer[i] + ", ");
            } else System.out.println(integer[i]);
        }

        for ( int i = floater.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(floater[i] + ", ");
            } else System.out.println(floater[i]);
        }

        for (int i = random.length - 1; i > 0; i--) {
            System.out.print(random[i] + ", ");
        }
    }

    public static void task4() {
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //
        //Распечатайте результат преобразования в консоль.

        System.out.println("\nЗадача_4");
        int[] integer = new int[]{1, 2, 3};

        for (int i = integer.length - 1; i >= 0; i--) {
            if (integer[i] % 2 != 0) {
                integer[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integer));
    }
}