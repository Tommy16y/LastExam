package kg.itacademy.lastexamm.service;

import kg.itacademy.lastexamm.entity.User;
import kg.itacademy.lastexamm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll() ;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteById(Long id) {
        User user = getById(id);
                if(user != null){
                    userRepository.deleteById(id);
                }
        return user;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


}
