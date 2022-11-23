package org.example;

public class Main {
    public static void main(String[] args) {
        Slackers slackerQueue1 = new Slackers("Иван", "Петр", "Сергей", "Павел", "Геннадий");
        Slackers slackerQueue2 = new Slackers("Сергей", "Михаил", "Артем", "Никита", "Альберт");
        Slackers slackerQueue3 = new Slackers("Борис", "Владимир", "Иннокентий", "Даниил", "Федор");
        Slackers slackerQueue4 = new Slackers("Егор", "Виктор", "Анатолий", "Игорь", "Роман");
        Slackers slackerQueue5 = new Slackers("Ильнур", "Рамзан", "Эльшат", "Саид", "Ахмед");

        System.out.println("Запуск потоков: ");
        slackerQueue1.start();
        slackerQueue2.start();
        slackerQueue3.start();
        slackerQueue4.start();
        slackerQueue5.start();

              int[] numbers = new int[10000];
            System.out.println("Запуск многопоточного метода..");
            MultiThread multiThread = new MultiThread(numbers);
            multiThread.start();
            System.out.println(numbers.toString());


            System.out.println("Запуск однопоточного метода..");
            SingleThread.SingleThread(numbers);
            System.out.println(numbers.toString());

            Incrementer incrementer = new Incrementer();
            incrementer.setNumb(1);
            incrementer.setIncrement(3000);
            System.out.println("Запуск потоков");
            incrementer.start();
        }

    }
