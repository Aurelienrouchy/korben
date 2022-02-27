package korben.util.Errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserExistException extends ResponseStatusException {

        public UserExistException(String message){
            super(HttpStatus.CONFLICT, message);
        }
}
