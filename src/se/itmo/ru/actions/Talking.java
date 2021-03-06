package se.itmo.ru.actions;

public interface Talking extends MakingSound {
    String DEFAULT_PHRASE = "DEFAULT PHRASE!";

    default void sayPhrase(String phrase) {
        makeSound(phrase);
    }

    default void say() {
        sayPhrase(DEFAULT_PHRASE);
    }
}
