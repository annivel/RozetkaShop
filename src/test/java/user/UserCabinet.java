package user;

import java.util.Objects;

public class UserCabinet {
    public String login;
    public String password;

    public UserCabinet(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCabinet)) return false;
        UserCabinet that = (UserCabinet) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "UserCabinet{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}