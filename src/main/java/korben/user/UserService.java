package korben.user;

import korben.provider.Provider;
import korben.provider.ProviderService;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ProviderService providerService;

    public UserService(UserRepository userRepository, ProviderService providerService) {
        this.userRepository = userRepository;
        this.providerService = providerService;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

//    public User save(User newUser) {
//        Query query = new Query();
//        User user = userRepository.findBy();
//
//        if (Objects.nonNull(user)) {
//            throw new UserExistException("User " + user.getName() + "already exist");
//        } else {
//            return new ResponseEntity<>(user, HttpStatus.CREATED);
//        }
//    }

    public ResponseEntity<User> connection(String id) {
        Optional<Provider> provider = providerService.findByProviderId(id);

        System.out.println("isEmpty " + provider);
        if (provider.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        System.out.println(provider);

        String userId = provider.get().getUserId();

        System.out.println(userId);


        Optional<User> user = userRepository.findById(new ObjectId(userId));

        if (user.isPresent()) {
            System.out.println("user" + user.get());
        }
        else {
            System.out.println("Employee not found!");
        }


        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}
