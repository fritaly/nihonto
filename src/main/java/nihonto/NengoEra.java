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
    TENYO(1144)
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
