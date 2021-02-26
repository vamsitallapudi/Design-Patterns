package com.coderefer.designPatterns.intro;

abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    void swim() {}
    void display() {}
    void performFly() {
        flyBehaviour.fly();
    }
    void performQuack() {
        quackBehaviour.quack();
    }
}
