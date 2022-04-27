package DemoTest;

public class DanhBa {
    private String phoneNumber;
    private String directory;
    private String name;
    private String gender;
    private String address;


    public DanhBa() {
    }

    public DanhBa(String phoneNumber, String directory, String name, String gender, String address) {
        this.phoneNumber = phoneNumber;
        this.directory = directory;
        this.name = name;
        this.gender = gender;
        this.address = address;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "DanhBa{" +
                "phoneNumber=" + phoneNumber +
                ", directory='" + directory + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' ;
    }
}