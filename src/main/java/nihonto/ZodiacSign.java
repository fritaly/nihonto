/**
 * Copyright 2021-2022, Francois Ritaly
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nihonto;

/**
 * <p>Enumerates the 12 signs from the Japanese zodiac system known as "Ju Ni Shi".</p>
 */
public enum ZodiacSign {
    RAT("NEZUMI"), // aka "NE"
    OX("USHI"),
    TIGER("TORA"),
    RABBIT("USAGI"), // aka "U"
    DRAGON("TATSU"),
    SNAKE("HEBI"), // aka "MI"
    HORSE("UMA"),
    GOAT("HITSUJI"),
    MONKEY("SARU"),
    ROOSTER("TORI"),
    DOG("INU"),
    PIG("INOSHISHI"); // aka "I"

    /**
     * <p>Internal array used for preventing repeated calls to the method {@link #values()} (optimization).</p>
     */
    private static final ZodiacSign[] VALUES = values();

    private final String romaji;

    ZodiacSign(String romaji) {
        this.romaji = romaji;
    }

    public String getRomaji() {
        return romaji;
    }

    public ZodiacSign next() {
        return VALUES[(ordinal() + 1) % VALUES.length];
    }

    /**
     * <p>Returns the {@link ZodiacSign} sign with the given romaji name or null if none matches.</p>
     *
     * @param romaji the romaji name of the requested {@link ZodiacSign}. Can't be blank.
     * @return the {@link ZodiacSign} sign found or null if none matches the given name.
     */
    public static ZodiacSign fromRomaji(String romaji) {
        Assert.notBlank(romaji, "animal name");

        for (ZodiacSign value: values()) {
            if (value.romaji.equalsIgnoreCase(romaji)) {
                return value;
            }
        }

        return null;
    }
}
