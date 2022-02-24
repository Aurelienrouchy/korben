package korben;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Studentrepository extends MongoRepository<Student, String> {

}
