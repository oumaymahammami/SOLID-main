package com.directi.training.lsp.tp;

public class Pool
{
    public void run() {
        Quackable donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn();

        quack(donaldDuck, electricDuck);
        swim((Swimmable) donaldDuck, electricDuck);
    }

    private void quack(Quackable... ducks) {
        for (Quackable duck : ducks) duck.quack();
    }

    private void swim(Swimmable... ducks) {
        for (Swimmable duck : ducks) duck.swim();
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
