package se.itmo.ru.objects;

import se.itmo.ru.actions.*;
import se.itmo.ru.objects.Animal;

public class Human extends Animal implements Talking, Shouting, Breaking, Repairing {
    public Human(String sound, String name) {
        super(sound, name);
    }

    //FIXME: мб стоит переопределить методы broke и repair
}
