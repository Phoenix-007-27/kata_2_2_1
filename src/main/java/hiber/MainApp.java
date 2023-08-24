package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

   userService.add(new User("tim", "sol", "tim@ggg.com", new Car("mers", 600)));
        userService.add(new User("sam", "gigs", "sam@mail.ru", new Car("bmw", 3)));
        userService.add(new User("obivan", "kenobi", "ben@mail.ru", new Car("volvo", 60)));
        userService.add(new User("dart", "vader", "eni@mail.ru", new Car("ford", 25)));


        User user4 = userService.getUser(1);
        List<User> list = userService.getUserbyCar("mers", 600);

        System.out.println(list);

        List<User> users = userService.listUsers();
        for (User u : users) {
            System.out.println("Id = " + u.getId());
            System.out.println("First Name = " + u.getFirstName());
            System.out.println("Last Name = " + u.getLastName());
            System.out.println("Email = " + u.getEmail());
            System.out.println();
        }
        System.out.println(users);

        context.close();
    }
}
