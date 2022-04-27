package DemoTest;

public interface QuanLyy<T> {
    void add(T t);

    void display();


    void edit(String phoneNumber, T t);


    void delete(String phoneNumber);


    int findByPhoneNumber(String phoneNumber);
}