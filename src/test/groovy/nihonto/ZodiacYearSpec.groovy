/*
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
        1984 | 'KINOYE NEZUMI'
        1985 | 'KINOTO USHI'
        1986 | 'HINOYE TORA'
        1987 | 'HINOTO USAGI'
        1988 | 'TSUCHINOYE TATSU'
        1989 | 'TSUCHINOTO HEBI'
        1990 | 'KANOYE UMA'
        1991 | 'KANOTO HITSUJI'
        1992 | 'MIDZUNOYE SARU'
        1993 | 'MIDZUNOTO TORI'
        1994 | 'KINOYE INU' // <-- Jikkan new cycle (11th)
        1995 | 'KINOTO INOSHISHI'
        1996 | 'HINOYE NEZUMI' // <-- Sign new cycle (13th)
        1997 | 'HINOTO USHI'
        1998 | 'TSUCHINOYE TORA'
        1999 | 'TSUCHINOTO USAGI'
        2000 | 'KANOYE TATSU'

        // Years before the reference date (1984)
        1924 | 'KINOYE NEZUMI'
        1925 | 'KINOTO USHI'
        1926 | 'HINOYE TORA'
        1927 | 'HINOTO USAGI'
        1928 | 'TSUCHINOYE TATSU'

        // Years after the reference date (1984)
        2044 | 'KINOYE NEZUMI'
        2045 | 'KINOTO USHI'
        2046 | 'HINOYE TORA'
        2047 | 'HINOTO USAGI'
        2048 | 'TSUCHINOYE TATSU'
    }
}