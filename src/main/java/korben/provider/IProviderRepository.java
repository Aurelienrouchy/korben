package korben.provider;

import korben.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProviderRepository extends MongoRepository<User, String> {


}
