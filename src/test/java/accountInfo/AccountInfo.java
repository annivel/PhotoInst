package accountInfo;

import java.util.Objects;

public class AccountInfo {
    public String login;
    public String password;

    public AccountInfo(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountInfo)) return false;
        AccountInfo that = (AccountInfo) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
