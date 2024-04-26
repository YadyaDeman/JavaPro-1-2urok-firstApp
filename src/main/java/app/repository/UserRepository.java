package app.repository;

import app.domain.User;

import java.util.List;

public interface UserRepository {
    User save(User user); //sozdaem polzovatelya
    User getById(Long id);

    List<User> getAll();//vozvrashaet userov
    User update (User user);//obnovlyaem dannie usera
    void deleteById(Long id);//udalit usera
}
