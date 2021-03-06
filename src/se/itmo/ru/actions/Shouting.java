package se.itmo.ru.actions;

public interface Shouting extends Talking {
    String DEFAULT_SHOUT = "H*LY FU***NG S**T!";

    default void shoutPhrase(String phrase) {
        sayPhrase(phrase);
    }

    default void shout() {
        shoutPhrase(DEFAULT_SHOUT);
    }
}
