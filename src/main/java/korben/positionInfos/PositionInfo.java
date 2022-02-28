package korben.positionInfos;

import lombok.NonNull;
import lombok.Value;
import org.bson.types.ObjectId;

@Value
public class PositionInfo {

    @NonNull
    ObjectId userId;

    @NonNull
    String timezone;

    @NonNull
    Country country;

    @NonNull
    Address address;
}
