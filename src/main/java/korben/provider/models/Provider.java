package korben.provider.models;

import com.mongodb.lang.Nullable;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Provider {

    @Id
    private String id;

    @NonNull
    private ProviderName name;

    @NonNull
    private String providerId;

    @Nullable
    private String userId;
}
