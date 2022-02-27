package korben.provider;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends MongoRepository<Provider, String> {

    public Provider findByProviderId(String providerId);
}
