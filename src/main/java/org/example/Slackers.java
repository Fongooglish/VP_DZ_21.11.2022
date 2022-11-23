package org.example;

public class Slackers extends Thread {
    private String[] names;

    public Slackers(String... names) {
        this.names = names;
    }
    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Выявлен бездельник №" + i + ": " +names[i]);
            try {
                sleep(100);
            } catch (Exception e) {};
        }
    }

}
