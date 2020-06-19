/*
 * Copyright (c) 2020 Workday
 * All Rights Reserved
 *
 * This software is protected by copyright and other intellectual
 * property rights and by international treaties. Any unauthorised
 * reproduction or distribution of this software or any portion
 * thereof is strictly prohibited.
 */
package nihonto;

/**
 * <p>Enumerates the 10 signs from the Japanese ordinal system "Jikkan".</p>
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

    private final char character;

    Jikkan(char character) {
        this.character = character;
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
