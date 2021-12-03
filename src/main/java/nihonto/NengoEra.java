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
 * <p>Enumerates the eras in the Japanese Nengo calendar.</p>
 */
public enum NengoEra {
    CHOHO(999),
    KWANKO(1004),
    CHOWA(1012),
    KWANNIN(1017),
    JIAN(1021),
    MANJU(1024),
    CHOGEN(1028),
    CHORYAKU(1037),
    CHOKYU(1040),
    KWANTOKU(1044),
    YEISHO(1046),
    TENGI(1053),
    KOHEI(1058),
    JIRYAKU(1065),
    YENKYU(1069),
    JOHO(1074),
    SHORYAKU(1077),
    YEIHO(1081),
    OTOKU(1084),
    KWANJI(1087),
    KAHO(1094),
    YEICHO(1096),
    SHOTOKU(1097),
    KOWA(1099),
    CHOJI(1104),
    KASHO(1106),
    TENNIN(1108),
    TENYEI(1110),
    YEIKYU(1113),
    GENYEI(1118),
    HOAN(1120),
    TENCHI(1124),
    DAIJI(1126),
    TENSHO(1131),
    CHOSHO(1132),
    HOYEN(1135),
    YEIJI(1141),
    KOJI(1142),
    TENYO(1144),
    KUYAN(1145),
    NINPEI(1151),
    KYUJU(1154),
    HOGEN(1156),
    HEIJI(1159),
    YEIRYAKU(1160),
    OHO(1161),
    CHOKWAN(1163),
    YEIMAN(1165),
    NINAN(1166),
    KAO(1169),
    JOAN(1171),
    ANGEN(1175),
    JISHO(1177),
    YOWA(1181),
    JUYEI(1182),
    GENRYAKU(1184),
    BUNJI(1185),
    KENKYU(1190),
    SHOJI(1199),
    KENNIN(1201),
    GENKYU(1204),
    KENYEI(1206),
    JOGEN(1207),
    KENRYAKU(1211),
    KENPO(1213),
    JOKYU(1219),
    JOO(1222),
    GENNIN(1224),
    KAROKU(1225),
    ANTEI(1227),
    KWANKI(1229),
    JOYEI(1232),
    TENPUKU(1233),
    BUNRYAKU(1234),
    KATEI(1235),
    RYAKUNIN(1238),
    YENO(1239),
    NINJI(1240),
    KWANGEN(1243),
    HOJI(1247),
    KENCHO(1249),
    KOGEN(1256),
    SHOKA(1257),
    SHOGEN(1259),
    BUNO(1260),
    KOCHO(1261),
    BUNYEI(1264),
    KENJI(1275),
    KOAN_KAMAKURA(1278),
    SHOO(1288),
    YEININ(1293),
    SHOAN(1299),
    KENGEN(1302),
    KAGEN(1303),
    TOKUJI(1306),
    YENKEI(1308),
    OCHO(1311),
    SHOWA(1312),
    BUNPO(1317),
    GENO(1319),
    GENKO_1ST(1321),
    SHOCHU(1324),
    KAREKI(1326),
    GENTOKU(1329),
    GENKO_2ND(1331),
    KEMMU(1334),
    YENGEN(1336),
    RYAKUO(1338),
    KOKOKU(1340),
    KOYEI(1342),
    TEIWA(1345),
    SHOHEI(1346),
    KWANO(1350),
    BUNNA(1352),
    YENBUN(1356),
    JOJI(1362),

    ;

    /**
     * <p>The year when the era started.</p>
     */
    private final int startYear;

    NengoEra(int startYear) {
        this.startYear = startYear;
    }

    public int getStartYear() {
        return startYear;
    }
}
