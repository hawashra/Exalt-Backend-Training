package userRepo;
import user.User;

public class UserRepositoryConcrete implements UserRepository {

    @Override
    public User findUserById(int id) {
        // get user from database..

        return new User(id, "Hamza Awashra");
    }
}
