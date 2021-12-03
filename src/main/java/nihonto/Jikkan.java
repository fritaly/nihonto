/**
 * Copyright 2021, Francois Ritaly
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
