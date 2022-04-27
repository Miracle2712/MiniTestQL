package DemoTest;

public class ThongTinDanhBa extends DanhBa{
    private String birthDay;
    private String email;

    public ThongTinDanhBa() {
    }

    public ThongTinDanhBa(int phoneNumber, String directory, String name, String gender, String address, String birthDay, String email) {
        super(phoneNumber, directory, name, gender, address);
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ThongTinDanhBa{" +
                "birthDay='" + birthDay + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
