package app.repository;

import app.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
   private Map<Long, User> database = new HashMap<>();
   private Long currentId=0L;

//Задача Repository - сходить в database отдать данные с database,
// либо сохранить данные в database
   public UserRepositoryImpl() {//konstruktor dlya etogo faila-UserRepositoryImpl
       save(new User("test@test.com", "111"));
       save(new User("tester@test.com", "222"));
       save(new User("testcase@test.com", "333"));
    }

    @Override
    public User save(User user) {
        user.setId(++currentId);
        database.put(currentId, user);
        return user;
    }

    @Override
    public User getById(Long id) {
       return database.get(id);
    }

    @Override
    public List<User> getAll() {
       //return database.values().stream().toList(); //database.znacheniya.v list
        return new ArrayList<>(database.values()); //v novom liste database i znacheniya
    }

    @Override
    public User update(User user) {
        database.put(user.getId(), user); //put - prinimaet
        return user;
    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);

    }
}
