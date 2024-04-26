package app.controller;

import app.domain.User;
import app.service.UserService;
//принять запрос
// -> вызывать метод service
// -> отдать ответ клиенту

//только Controller работает с фронтэндом
public class UserController {
    //вызывает бизнесс-процессы внутри приложения и поэтому обращается к Service
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public User getById(Long id) { //должен приять запрос
        // по тому какой запрос пришел, понять что делать
        //обратиться к Service, вызвать у Service соответствцющий метод,
        // и вернуть результат клиенту
        return service.getById(id);
    }

    public User save(User user) {
        return service.save(user);
    }

}
