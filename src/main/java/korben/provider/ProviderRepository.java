package korben.provider;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends MongoRepository<Provider, String> {

    public Optional<Provider> findByProviderId(String providerId);
}
