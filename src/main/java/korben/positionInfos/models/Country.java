package korben.positionInfos.models;

import lombok.NonNull;
import lombok.Value;

@Value
public class Country {

    @NonNull
    String name;

    @NonNull
    String cc;

    @NonNull
    String alpha3;
}
