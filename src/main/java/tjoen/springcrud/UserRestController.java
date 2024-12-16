package tjoen.springcrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    Map<Long, User> db = new HashMap<>();

    public UserRestController() {
        db.put(10L, new User("a", "별명1", "김", ""));
        db.put(11L, new User("b", "별명2", "이", ""));
        db.put(12L, new User("c", "별명3", "박", ""));
        db.put(13L, new User("d", "별명4", "최", ""));
        db.put(14L, new User("aaa11",
                "AA",
                "김씨",
                "cchheerryy123"));
    }

    @GetMapping("/profile/{userId}")
    public UserResponse getProfile(@PathVariable(name = "userId") Long userId) {

        User user = db.get(userId);
        return new UserResponse(
                user.getLoginId(),
                user.getNickname(),
                user.getName());

    }
}
