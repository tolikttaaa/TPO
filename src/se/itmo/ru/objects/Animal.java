package se.itmo.ru.objects;

import se.itmo.ru.actions.MakingSound;
import se.itmo.ru.actions.Sensitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Animal extends Item implements MakingSound, Sensitive {
    private static final String CLASS_ANIMAL = "Animal";
    private static final double MAX_DISTANCE = 1000.0;
    private final Set<Sense> senses;

    private final String sound;

    public Animal(String name, String sound) {
        super(CLASS_ANIMAL, name);
        this.sound = sound;
        this.senses = new HashSet<>();
    }

    Animal(String className, String name, String sound) {
        super(className, name);
        this.sound = sound;
        this.senses = new HashSet<>();
    }

    @Override
    public void makeDefaultSound() {
        makeSound(sound);
    }

    @Override
    public void feel(Sense sense) {
        if (sense.getGroup() != Sense.SenseGroup.NEUTRAL) {

            Sense.SenseGroup opposite = sense.getGroup() == Sense.SenseGroup.NEGATIVE ? Sense.SenseGroup.POSITIVE
                    : Sense.SenseGroup.NEGATIVE;
            senses.removeIf(curSense -> curSense.getGroup() == opposite);
        }

        senses.add(sense);
    }

    @Override
    public void move(double dx, double dy, double dz) {
        if (Math.sqrt(dx*dx + dy*dy + dz*dz) > MAX_DISTANCE) {
            feel(Sense.TIRED);
        }
        super.move(dx, dy, dz);
    }

    public List<Sense> getSenses() {
        return new ArrayList<>(senses);
    }
}
