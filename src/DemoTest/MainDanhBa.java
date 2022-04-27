package DemoTest;

import java.util.Scanner;

public class MainDanhBa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();

        int choice = 1;

        while (choice!=0) {
            System.out.println("--------------MENU-----------------");
            System.out.println("Vui long nhap lua chon");
            System.out.println("" +
                    "1. Thêm Danh Bạ\n" +
                    "2. Hiện thị thông tin người trong danh bạ.\n" +
                    "3. Sửa số điện thoại\n"+
                    "4. Xóa số trong danh bạ\n"+
                    "5. Tìm số trong danh bạ"

            );
            choice= scanner.nextInt();
            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhập sđt");
                    String so = sc.nextLine();

                    sc = new Scanner(System.in);
                    System.out.println("Nhập nhóm danh bạ");
                    String nhom = sc.nextLine();

                    sc= new Scanner(System.in);
                    System.out.println("Nhập tên ");
                    String ten = sc.nextLine();

                    sc= new Scanner(System.in);
                    System.out.println("Nhập giới tính ");
                    String gioiTinh = sc.nextLine();

                    sc= new Scanner(System.in);
                    System.out.println("NHập địa chỉ");
                    String diaChi = sc.nextLine();

                    DanhBa danhBa1 = new DanhBa(so, nhom, ten, gioiTinh, diaChi);
                    quanLyDanhBa.add(danhBa1);
                    break;

                case 2:
                    quanLyDanhBa.display();
                    break;
                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("số cần sửa");
                    String sdt = sc.nextLine();

                    sc = new Scanner(System.in);
                    System.out.println("Nhập sđt");
                    so = sc.nextLine();

                    sc = new Scanner(System.in);
                    System.out.println("Nhập nhóm danh bạ");
                    nhom = sc.nextLine();

                    sc= new Scanner(System.in);
                    System.out.println("Nhập tên ");
                    ten = sc.nextLine();

                    sc= new Scanner(System.in);
                    System.out.println("Nhập giới tính ");
                    gioiTinh = sc.nextLine();

                    sc= new Scanner(System.in);
                    System.out.println("NHập địa chỉ");
                    diaChi = sc.nextLine();
                    quanLyDanhBa.edit(sdt, new DanhBa(so, nhom, ten, gioiTinh, diaChi));
                    quanLyDanhBa.display();
                    break;

                case 4:
                    sc = new Scanner(System.in);
                    System.out.println("số cần xóa");
                    String xoa = sc.nextLine();
                    quanLyDanhBa.delete(xoa);
                    break;

                case 5:
                    sc = new Scanner(System.in);
                    System.out.println("số cần tìm");
                    String timSo = sc.nextLine();
                    quanLyDanhBa.findByPhoneNumber(timSo);
            }
        }
    }
}