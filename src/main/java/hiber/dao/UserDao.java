package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void add(Car car);
   User getUser(long id);
   List<User> getUserbyCar(String model, int series);


   List<User> listUsers();
}
