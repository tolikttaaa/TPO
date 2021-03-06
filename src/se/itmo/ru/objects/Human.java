package se.itmo.ru.objects;

import se.itmo.ru.actions.*;

public final class Human extends Animal implements Talking, Shouting, Breaking, Repairing {
    private static final String CLASS_HUMAN = "Human";
    private static final String DEFAULT_HUMAN_SOUND = "Hello, world!";

    public Human(String name) {
        this(name, DEFAULT_HUMAN_SOUND);
    }

    public Human(String name, String sound) {
        super(CLASS_HUMAN, name, sound);
    }

    @Override
    public void shoutPhrase(String phrase) {
        feel(Sense.POSITIVE);
        sayPhrase(phrase);
    }

    //TODO: добавить возможность try (попробовать что-то сделать, выполнить с какой-то вероятностью, задана константой)
    //FIXME: мб стоит переопределить методы broke и repair
}
