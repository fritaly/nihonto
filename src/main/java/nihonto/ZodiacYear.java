package nihonto;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>A year in the Japanese zodiac dating system.</p>
 */
public class ZodiacYear {

    private final Jikkan jikkan;

    private final ZodiacSign sign;

    public ZodiacYear(Jikkan jikkan, ZodiacSign sign) {
        Assert.notNull(jikkan, "Jikkan");
        Assert.notNull(sign, "zodiac sign");

        this.jikkan = jikkan;
        this.sign = sign;
    }

    public Jikkan getJikkan() {
        return jikkan;
    }

    public ZodiacSign getSign() {
        return sign;
    }

    public String asText(boolean japanese) {
        if (japanese) {
            // Example: "KINOYE NE"
            return String.format("%s %s", jikkan.name(), sign.name());
        }

        // Example: "A RAT"
        return String.format("%s %s", jikkan.getCharacter(), sign.getAnimal().toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZodiacYear that = (ZodiacYear) o;
        return jikkan == that.jikkan &&
                sign == that.sign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jikkan, sign);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ZodiacYear.class.getSimpleName() + "[", "]")
                .add("jikkan=" + jikkan)
                .add("sign=" + sign)
                .toString();
    }
}
