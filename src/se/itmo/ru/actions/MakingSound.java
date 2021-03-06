package se.itmo.ru.actions;

public interface MakingSound {
    String DEFAULT_SOUND = "DEFAULT SOUND!";

    default void makeSound(String sound) {
        System.out.println(sound);
    }

    default void makeDefaultSound() {
        makeSound(DEFAULT_SOUND);
    }
}
