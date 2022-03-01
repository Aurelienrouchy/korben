package korben.util.Errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public RessourceNotFoundException(String message) {
        super(message);
    }
}
