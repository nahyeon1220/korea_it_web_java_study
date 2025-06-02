package _27_Bean;

//Bean
//하나의 객체 설계 규칙 (명세, 가이드라인)
//멤버변수들은 private => 캡슐화
//기본 생성자
//getter와 setter가 모두 구현되어 있어야 함 => 외부 접근을 위해

public class UserEntity {

    private int userId;
    private String userName;
    private int userAge;
    private String userEmail;

    public UserEntity() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "UserEntity(" +
                "userId= " + userId +
                ", userName= " + userName +
                ", userAge= " + userAge +
                ", userEmail= " + userEmail +
                ")";
    }


}
