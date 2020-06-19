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
        1989 | 'TSUCHINOTO MI'
        1990 | 'KANOYE UMA'
        1991 | 'KANOTO HITSUJI'
        1992 | 'MIDZUNOYE SARU'
        1993 | 'MIDZUNOTO TORI'
        1994 | 'KINOYE INU' // <-- Jikkan new cycle (11th)
        1995 | 'KINOTO I'
        1996 | 'HINOYE NE' // <-- Sign new cycle (13th)
        1997 | 'HINOTO USHI'
        1998 | 'TSUCHINOYE TORA'
        1999 | 'TSUCHINOTO U'
        2000 | 'KANOYE TATSU'

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