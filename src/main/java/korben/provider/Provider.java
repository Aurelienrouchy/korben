package korben.provider;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Provider {

    @Id
    private String id;
    private ProviderName name;
    private String providerId;
    private String userId;

    public Provider(ProviderName name, String providerId, String userId) {
        this.name = name;
        this.providerId = providerId;
        this.userId = userId;
    }
}
