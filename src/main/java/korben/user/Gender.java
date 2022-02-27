package korben.user;

public enum Gender {
    MALE("1"), FEMALE("0"), OTHER("-1");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
