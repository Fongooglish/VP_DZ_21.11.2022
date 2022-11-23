package org.example;

public class MultiThread extends Thread {
    private int[] numbers;
    long start = System.currentTimeMillis();

    public MultiThread(int[] numbers) {
        this.numbers = numbers;
    }
    @Override
    public void run() {
            for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
//            try {
//              sleep();
//            } catch (Exception e) {};
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Массив заполнен");
        System.out.println("Затраченное время на выполнение программы в многопоточном режиме (мс): " + elapsed);
        for (int a: numbers) {
            System.out.print(a + " ");
        }
    }

}
