package app.service;

import app.domain.User;
import app.repository.UserRepository;

public class UserServiceImpl implements UserService{
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
//Провести всю необходимую бизнес-логику,
// выполнить весь необходимый код
// обработать соответствующим образом все объекты
    @Override
    public User getById(Long id) {
        /*Здесь идут различные проверки и бизнес логика: (для чего мы можем получать объект пользователя?)
        * Например, идет проверка его прошлых заказов,
        * и на основании этого рассчитывается его текущая скидка */
        return repository.getById(id);
    }

    @Override
    public User save(User user) {
        /*Здесь идут различные проверки и бизнес логика: (функционал при сохранении юзера - к апдейту пользователя - изменился адрес доставки)
         при сохранении нового пользователя: выдать скидку при регистрации
         * Например, здесь мы можем отправить ему мейл
         * какую либо вступительную информацию Например, приведи друга */
        return repository.save(user);
    }
}
