package DemoTest;

public interface QuanLyy<T> {
    void add(T t);

    void display();


    void edit(int phoneNumber, T t);


    void delete(int phoneNumber);


    int findByPhoneNumber(int phoneNumber);
}
