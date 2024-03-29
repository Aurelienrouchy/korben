package korben.provider.models;

public enum ProviderName {
    FACEBOOK("facebook"), GOOGLE("google");

    private final String value;

    ProviderName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
