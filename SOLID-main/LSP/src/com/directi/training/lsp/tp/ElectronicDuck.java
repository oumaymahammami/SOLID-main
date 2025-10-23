package com.directi.training.lsp.tp;

public class ElectronicDuck implements Quackable, Swimmable
{
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) System.out.println("Electronic duck quack...");
    }

    @Override
    public void swim() {
        if (_on) System.out.println("Electronic duck swim");
    }

    public void turnOn() { _on = true; }
    public void turnOff() { _on = false; }
}

