package tjoen.springcrud;

public class User {
    private String loginId;
    private String nickname;
    private String name;
    private String password;

    public String getNickname() {
        return nickname;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getName() {
        return name;
    }

    public User(String loginId, String nickname, String name, String password) {
        this.loginId = loginId;
        this.nickname = nickname;
        this.name = name;
        this.password = password;
    }
}
