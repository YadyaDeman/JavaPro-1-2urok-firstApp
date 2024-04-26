package client;

import app.controller.UserController;
import app.domain.User;
import app.repository.UserRepository;
import app.repository.UserRepositoryImpl;
import app.service.UserService;
import app.service.UserServiceImpl;

 //Имитация фронтэнд - обращаемся к Controller
public class Client {
    public static void main(String[] args) {
//repository -> service -> controller
        UserRepository repository = new UserRepositoryImpl();
        UserService service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);

        System.out.println(controller.getById(2L));
        System.out.println(controller.getById(4L));

        controller.save(new User("lyuck@test.com", "1234"));
        System.out.println(controller.getById(4L));

    }

}
