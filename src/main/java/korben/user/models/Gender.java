package korben.user.models;

public enum Gender {
    MALE(1), FEMALE(0), OTHER(-1);

    private final Integer value;

    Gender(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
