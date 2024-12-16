package tjoen.springcrud;

public class UserResponse {
    private String loginId;
    private String nickname;
    private String name;

    public UserResponse(String loginId, String nickname, String name) {

        this.loginId = loginId;
        this.nickname = nickname;
        this.name = name;
    }

    public String getLoginId() {

        return loginId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }
}
