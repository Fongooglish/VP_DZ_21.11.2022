package org.example;

public class Incrementer extends Thread {
    private int numb;
    private int increment;

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting ");
        System.out.println("Увеличиваем значение: " + numb + " на " + increment + " единиц");
        for (int i = 1; i <= increment; i++) {
            numb += 1;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {e.getMessage();}
        }
        System.out.println("Увеличение осуществлено, новое значение: " + numb);
    }

}


