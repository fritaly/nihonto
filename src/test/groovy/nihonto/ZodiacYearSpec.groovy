package nihonto

import spock.lang.Specification
import spock.lang.Unroll

class ZodiacYearSpec extends Specification {

    @Unroll('fromYear(#year) should return "#result"')
    void 'fromYear()'() {
        expect:
        ZodiacYear.fromYear(year).asText(true) == result

        where:
        year | result
        1984 | 'KINOYE NE'
        1985 | 'KINOTO USHI'
        1986 | 'HINOYE TORA'
        1987 | 'HINOTO U'
        1988 | 'TSUCHINOYE TATSU'

        // Years before the reference date (1984)
        1924 | 'KINOYE NE'
        1925 | 'KINOTO USHI'
        1926 | 'HINOYE TORA'
        1927 | 'HINOTO U'
        1928 | 'TSUCHINOYE TATSU'

        // Years after the reference date (1984)
        2044 | 'KINOYE NE'
        2045 | 'KINOTO USHI'
        2046 | 'HINOYE TORA'
        2047 | 'HINOTO U'
        2048 | 'TSUCHINOYE TATSU'
    }
}