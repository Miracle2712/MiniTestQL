package DemoTest;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa implements QuanLyy<DanhBa> {
    List<DanhBa> danhBaList = new ArrayList<>();

    public QuanLyDanhBa() {
    }


    @Override
    public void add(DanhBa danhBa) {
        danhBaList.add(danhBa);
    }

    @Override
    public void display() {
        for (int i = 0; i < danhBaList.size(); i++) {
            System.out.println(danhBaList.get(i));
        }
    }


    @Override
    public void edit(String phoneNumber, DanhBa danhBa) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getPhoneNumber().equals(phoneNumber)) {
                danhBaList.set(i, danhBa);
            }
        }
    }

    @Override
    public void delete(String phoneNumber) {
        if (findByPhoneNumber(phoneNumber) != -1) {
            danhBaList.remove(findByPhoneNumber(phoneNumber));
        } else {
            System.out.println("Không tìm được danh bạ với số điện thoại trên.");
        }
    }

    @Override
    public int findByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getPhoneNumber().equals(phoneNumber)) {
                System.out.println(danhBaList.get(i));
                return i;
            }
        }
        System.out.println("không có trong danh bạ");
        return -1;
    }
}


