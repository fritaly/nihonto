package nihonto;

/**
 * <p>Enumerates the 10 signs from the Japanese decimal ordinal system "Jikkan".</p>
 */
public enum Jikkan {
    KINOYE('A'),
    KINOTO('B'),
    HINOYE('C'),
    HINOTO('D'),
    TSUCHINOYE('E'),
    TSUCHINOTO('F'),
    KANOYE('G'),
    KANOTO('H'),
    MIDZUNOYE('I'),
    MIDZUNOTO('J');

    /**
     * <p>Internal array used for preventing repeated calls to the method {@link #values()} (optimization).</p>
     */
    private static final Jikkan[] VALUES = values();

    private final char character;

    Jikkan(char character) {
        this.character = character;
    }

    public Jikkan next() {
        return VALUES[(ordinal() + 1) % VALUES.length];
    }

    /**
     * <p>Returns the character associated to the Jikkan sign.</p>
     *
     * @return a character.
     */
    public char getCharacter() {
        return character;
    }

    /**
     * <p>Returns the {@link Jikkan} sign associated to the given character or null if none matches.</p>
     *
     * @param c a character whose associated {@link Jikkan} sign is requested.
     * @return the {@link Jikkan} sign found or null if none matches the given character.
     */
    public static Jikkan fromCharacter(char c) {
        for (Jikkan value: values()) {
            if (value.character == c) {
                return value;
            }
        }

        return null;
    }
}
