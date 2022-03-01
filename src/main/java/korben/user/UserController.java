package korben.user;

import korben.provider.ProviderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;
    private final ProviderService providerService;

    public UserController(UserService userService, ProviderService providerService) {
        this.userService = userService;
        this.providerService = providerService;
    }

    @GetMapping("users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

//    @PostMapping( "user")
//    public ResponseEntity<User> addUser(@RequestBody User newUser) {
//        User user = userService.save(newUser);
//
//        if (Objects.nonNull(user)) {
//            throw new UserExistException("User " + user.getName() + "already exist");
//        } else {
//            return new ResponseEntity<>(user, HttpStatus.CREATED);
//        }
//    }

    @GetMapping("connection")
    public ResponseEntity<User> connection(@RequestParam String id) {
        return userService.connection(id);
    }
}
