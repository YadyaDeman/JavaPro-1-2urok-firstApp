package app.service;

import app.domain.User;

public interface UserService {

    User getById(Long Id);

    User save (User user);
}
