package org.example;

public class SingleThread {
    static long start = System.currentTimeMillis();

    public static void SingleThread(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println("Массив заполнен");
        System.out.println("Затраченное время на выполнение программы в однопоточном режиме (мс): " + elapsed);
        for (int a: numbers) {
            System.out.print(a + " ");
        }
    }
}

