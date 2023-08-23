package hiber;

import hiber.config.AppConfig;
//import hiber.model.Car;
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

//        Car car = new Car("mers", 600);
//        userService.add(car);
//        User user = new User("tim", "sol", "tim@mail.ru");
//        user.setCar(car);
//        userService.add(user);
//
//        Car car1 = new Car("bmw", 3);
//        userService.add(car1);
//        User user1 = new User("sam", "gigs", "sam@mail.ru");
//        user1.setCar(car1);
//        userService.add(user1);
//
//        Car car2 = new Car("volvo", 60);
//        userService.add(car2);
//        User user2 = new User("obivan", "kenobi", "ben@mail.ru");
//        user2.setCar(car2);
//        userService.add(user2);
//
//        Car car3 = new Car("ford", 25);
//        userService.add(car3);
//        User user3 = new User("dart", "vader", "eni@mail.ru");
//        user3.setCar(car3);
//        userService.add(user3);
//
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
