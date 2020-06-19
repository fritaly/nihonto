package nihonto;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>A year in the Japanese zodiac dating system.</p>
 */
public class ZodiacYear {

    /**
     * <p>Returns a {@link ZodiacYear} from the given Gregorian calendar year.</p>
     *
     * @param year an integer representing a year in the Gregorian calendar. Can't be negative or zero.
     * @return a {@link ZodiacYear}. Never returns null.
     */
    public static ZodiacYear fromYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("The given year is negative or zero");
        }

        // Use 1984 ("KINOYE NEZUMI" = "A RAT") as the reference date
        int currentYear = 1984;

        if (currentYear > year) {
            final int difference = (currentYear - year) % 60;

            // We substract 60 to ensure that currentYear < year
            currentYear = year + difference - 60;
        } else if (currentYear < year) {
            final int difference = (year - currentYear) % 60;

            currentYear = year - difference;
        }

        // At this stage, currentYear < year -> difference > 0
        final int difference = year - currentYear;

        Jikkan jikkan = Jikkan.A;
        ZodiacSign sign = ZodiacSign.NEZUMI;

        if (difference > 0) {
            for (int i = 0; i < (difference % 10); i++) {
                jikkan = jikkan.next();
            }
            for (int i = 0; i < (difference % 12); i++) {
                sign = sign.next();
            }
        }

        return new ZodiacYear(jikkan, sign);
    }

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

    public ZodiacYear next() {
        return new ZodiacYear(jikkan.next(), sign.next());
    }

    public String asText(boolean japanese) {
        if (japanese) {
            // Example: "KINOYE NE"
            return String.format("%s %s", jikkan.getRomaji(), sign.name());
        }

        // Example: "A RAT"
        return String.format("%s %s", jikkan.name(), sign.getAnimal().toUpperCase());
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
