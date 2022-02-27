package korben.provider;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public Optional<Provider> findByProviderId(String id) {
        Provider provider = providerRepository.findByProviderId(id);

        if (provider == null) {
            return Optional.empty();
        }
        return Optional.of(provider);
    }

    public Provider insert(Provider provider) {
        return providerRepository.insert(provider);
    }
}
