package se.itmo.ru.actions;

public interface MakingNoise extends MakingSound {
    String DEFAULT_NOISE = "DEFAULT NOISE!";

    default void makeNoise(String noise) {
        makeSound(noise);
    }

    default void noise() {
        makeNoise(DEFAULT_NOISE);
    }
}
