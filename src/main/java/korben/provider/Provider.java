package korben.provider;

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

    public Provider(ProviderName name, String providerId, String userId) {
        this.name = name;
        this.providerId = providerId;
        this.userId = userId;
    }

    public Provider(ProviderName name, String providerId) {
        this.name = name;
        this.providerId = providerId;
    }
}
