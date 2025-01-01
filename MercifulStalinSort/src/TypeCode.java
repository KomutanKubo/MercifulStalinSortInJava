public enum TypeCode {
    BYTE(Byte.class),
    SHORT(Short.class),
    INTEGER(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    CHAR(Character.class);

    private final Class<?> typeClass;


    TypeCode(Class<?> typeClass) {
        this.typeClass = typeClass;
    }

    public Class<?> getTypeClass() {
        return typeClass;
    }

    public static boolean isValidType(Class<?> clazz) {
        for (TypeCode typeCode : values()) {
            if (typeCode.getTypeClass().equals(clazz)) {
                return true;
            }
        }
        return false;
    }
}
