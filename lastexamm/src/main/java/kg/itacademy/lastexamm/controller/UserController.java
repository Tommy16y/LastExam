package kg.itacademy.lastexamm.controller;

import kg.itacademy.lastexamm.entity.Request;
import kg.itacademy.lastexamm.entity.User;
import kg.itacademy.lastexamm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apius/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();

    }

    @PostMapping(value = "/createuser")
    public User create(@RequestBody User user) {
        return userService.create(user);

    }

    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @DeleteMapping
    public User deleteById(@RequestParam(value = "deletebyid") Long id) {
        return userService.deleteById(id);

    }
}
