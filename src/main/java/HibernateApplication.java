import model.Auto;
import model.User;
import service.UserService;

public class HibernateApplication {
    public static void main(String[] args) {

        UserService userService = new UserService();
        Auto auto = new Auto("Lada", "red");
        User user = userService.findUser(4);
        user.addAuto(auto);
        userService.updateUser(user);

    }
}
