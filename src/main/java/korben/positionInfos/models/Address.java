package korben.positionInfos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;

@Value
public class Address {

    @NonNull
    String country;

    @NonNull
    String postCode;

    @NonNull
    String city;
}
