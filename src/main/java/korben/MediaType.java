package korben;

public enum MediaType {
    VIDEO("video"), PHOTO("photo");

    private final String value;

    MediaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
