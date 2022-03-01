package korben.provider;

import korben.util.Errors.RessourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public Optional<Provider> findByProviderId(String id) {
        System.out.println("id is " +id);
        return Optional.ofNullable(providerRepository.findByProviderId(id).orElseThrow(() -> new RessourceNotFoundException("Provider " + id + "not found")));
    }

    public Provider insert(Provider provider) {
        return providerRepository.insert(provider);
    }
}
