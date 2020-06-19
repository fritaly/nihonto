package nihonto;

/**
 * <p>Enumerates the 10 signs from the Japanese decimal ordinal system known as "Jikkan".</p>
 */
public enum Jikkan {
    A("KINOYE"),
    B("KINOTO"),
    C("HINOYE"),
    D("HINOTO"),
    E("TSUCHINOYE"),
    F("TSUCHINOTO"),
    G("KANOYE"),
    H("KANOTO"),
    I("MIDZUNOYE"),
    J("MIDZUNOTO");

    /**
     * <p>Internal array used for preventing repeated calls to the method {@link #values()} (optimization).</p>
     */
    private static final Jikkan[] VALUES = values();

    private final String romaji;

    Jikkan(String romaji) {
        this.romaji = romaji;
    }

    public Jikkan next() {
        return VALUES[(ordinal() + 1) % VALUES.length];
    }

    /**
     * <p>Returns the japanese name (in romaji) associated to the Jikkan sign.</p>
     *
     * @return the jikkan sign in romaji. Never returns null.
     */
    public String getRomaji() {
        return romaji;
    }

    /**
     * <p>Returns the {@link Jikkan} sign associated to the given japanese name (in romaji) or null if none matches.</p>
     *
     * @param string the japanese name (in romaji) whose associated {@link Jikkan} sign is requested.
     * @return the {@link Jikkan} sign found or null if none matches the given string.
     */
    public static Jikkan fromRomaji(String string) {
        for (Jikkan value: values()) {
            if (value.romaji.equalsIgnoreCase(string)) {
                return value;
            }
        }

        return null;
    }
}
