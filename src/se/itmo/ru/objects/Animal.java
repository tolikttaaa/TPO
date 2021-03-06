package se.itmo.ru.objects;

import se.itmo.ru.actions.MakingSound;

public abstract class Animal extends Item
    implements MakingSound {

    private final String sound;

    public Animal(String sound, String name) {
        super(name);
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        makeSound(sound);
    }
}
