package userRepo;
import user.User;

public interface UserRepository {
    User findUserById(int id);
}

