package app.domain;


//Хранит классы с которыми мы работаем
public class User {
    private Long id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User user)) return false;
        if (!super.equals(object)) return false;
        return java.util.Objects.equals(id, user.id) && java.util.Objects.equals(email, user.email) && java.util.Objects.equals(password, user.password);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, email, password);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email='" + email + '\''+", password='" + password + '\''+'}';
    }
}

