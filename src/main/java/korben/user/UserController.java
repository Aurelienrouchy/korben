package korben.user;

import korben.provider.ProviderService;
import korben.user.mapper.UserMapper;
import korben.user.models.User;
import korben.user.models.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<UserDTO> getAllUsers() {
        UserMapper mapper = new UserMapper();
        List<User> users = userService.getUsers();
        List<UserDTO> usersDTO = new ArrayList<>();

        for (int i = 0; i < users.size(); i++) {
            usersDTO.add(mapper.toDTO(users.get(i)));
        }

        return usersDTO;
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
