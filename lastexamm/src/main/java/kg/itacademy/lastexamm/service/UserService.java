package kg.itacademy.lastexamm.service;

import kg.itacademy.lastexamm.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
List<User> getAll();
User create(User user);
User deleteById(Long Long);
    User getById(Long id);



}
