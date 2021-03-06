package se.itmo.ru.objects;

public enum Sense {
    IRRITATION("Irritation", SenseGroup.NEGATIVE),
    HAPPY("Happy", SenseGroup.POSITIVE),
    ANGRY("Angry", SenseGroup.NEGATIVE),
    LOVE("Love", SenseGroup.POSITIVE),
    SAD("Sad", SenseGroup.NEGATIVE),
    TIRED("Tired", SenseGroup.NEUTRAL),
    POSITIVE("Positive", SenseGroup.POSITIVE);

    private final String description;
    private final SenseGroup group;

    Sense(String description, SenseGroup group) {
        this.description = description;
        this.group = group;
    }

    public String toString() {
        return this.description;
    }

    public SenseGroup getGroup() {
        return this.group;
    }

    public enum SenseGroup {
        POSITIVE,
        NEUTRAL,
        NEGATIVE
    }
}
