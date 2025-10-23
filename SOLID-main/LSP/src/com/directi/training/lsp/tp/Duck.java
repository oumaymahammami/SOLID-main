package com.directi.training.lsp.tp;

public class Duck implements Quackable, Swimmable
{
    @Override
    public void quack() { System.out.println("Quack..."); }

    @Override
    public void swim() { System.out.println("Swim..."); }
}

