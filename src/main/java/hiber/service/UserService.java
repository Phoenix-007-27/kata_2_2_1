package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void add(Car user);
    User getUser(long id);
    List<User> getUserbyCar(String model, int series);

    List<User> listUsers();
}
