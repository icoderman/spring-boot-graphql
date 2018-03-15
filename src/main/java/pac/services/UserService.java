package pac.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pac.models.User;
import pac.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return (List)userRepository.findAll();
    }


    public User findOneById(ObjectId id) {
        return userRepository.findOne(id);
    }

    public List<User> findByIdIn(List<String> ids) {
        return userRepository.findByIdIn(ids);
    }
}
