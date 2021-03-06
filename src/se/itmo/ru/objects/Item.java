package se.itmo.ru.objects;

import se.itmo.ru.actions.Breakable;
import se.itmo.ru.actions.Moving;

public abstract class Item implements Breakable, Moving {
    private double positionX;
    private double positionY;
    private double positionZ;

    private boolean isBroken;

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public void beBroken() {
        if (isBroken) {
            //FIXME: мб запилить ошибку здесь
            System.out.println("Already broken!");
        }

        isBroken = true;
    }

    @Override
    public void beRepaired() {
        if (!isBroken) {
            //FIXME: мб запилить ошибку здесь
            System.out.println("Already restored!");
        }

        isBroken = false;
    }

    @Override
    public boolean isBroken() {
        return this.isBroken;
    }

    @Override
    public void move(double dx, double dy, double dz) {
        //TODO: обернуть все фунции в оболочку, которая будет говорить "<Name> совершает действие:"
        System.out.println("se.itmo.ru.objects.Item " + name + " moving!");

        this.positionX += dx;
        this.positionY += dy;
        this.positionZ += dz;
    }

    public double getPositionX() {
        return this.positionX;
    }

    public double getPositionY() {
        return this.positionY;
    }

    public double getPositionZ() {
        return this.positionZ;
    }
}
