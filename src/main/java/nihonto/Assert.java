package nihonto;

class Assert {

    static void notNull(Object object, String name) {
        if (object == null) {
            throw new IllegalArgumentException(String.format("The given %s is null", name));
        }
    }

    static void notBlank(String string, String name) {
        if ((string == null) || string.trim().isEmpty()) {
            throw new IllegalArgumentException(String.format("The given %s is blank", name));
        }
    }
}