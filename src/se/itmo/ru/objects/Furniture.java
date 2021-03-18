package se.itmo.ru.objects;

import se.itmo.ru.actions.MakingNoise;

public class Furniture extends Item implements MakingNoise {
    private static final String CLASS_FURNITURE = "Furniture";
    private final String noise;

    public Furniture(String name, String noise) {
        super(CLASS_FURNITURE, name);
        this.noise = noise;
    }

    Furniture(String className, String name, String noise) {
        super(className, name);
        this.noise = noise;
    }

    @Override
    public void makeNoise(String noise) {
        makeSound(this.noise);
    }
}
