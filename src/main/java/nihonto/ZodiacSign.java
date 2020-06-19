package nihonto;

/**
 * <p>Enumerates the 12 signs from the Japanese zodiac system known as "Ju Ni Shi".</p>
 */
public enum ZodiacSign {
    NEZUMI("Rat"), // aka "NE"
    USHI("Ox"),
    TORA("Tiger"),
    USAGI("Rabbit"), // aka "U"
    TATSU("Dragon"),
    HEBI("Snake"), // aka "MI"
    UMA("Horse"),
    HITSUJI("Goat"),
    SARU("Monkey"),
    TORI("Rooster"),
    INU("Dog"),
    INOSHISHI("Pig"); // aka "I"

    /**
     * <p>Internal array used for preventing repeated calls to the method {@link #values()} (optimization).</p>
     */
    private static final ZodiacSign[] VALUES = values();

    private final String animal;

    ZodiacSign(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public ZodiacSign next() {
        return VALUES[(ordinal() + 1) % VALUES.length];
    }

    /**
     * <p>Returns the {@link ZodiacSign} sign associated to the given animal or null if none matches.</p>
     *
     * @param animal the name of an animal whose associated {@link ZodiacSign} sign is requested. Can't be blank.
     * @return the {@link ZodiacSign} sign found or null if none matches the given animal.
     */
    public static ZodiacSign fromAnimal(String animal) {
        Assert.notBlank(animal, "animal name");

        for (ZodiacSign value: values()) {
            if (value.animal.equalsIgnoreCase(animal)) {
                return value;
            }
        }

        return null;
    }
}
