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
                    "4. Xóa số trong danh bạ\n"

            );
            choice= scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập sđt");
                    int so = scanner.nextInt();

                    Scanner sc = new Scanner(System.in);
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
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("số cần sửa");
                    int sdt = sc1.nextInt();

                    System.out.println("Nhập sđt");
                    so = scanner.nextInt();

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
                    sc1 = new Scanner(System.in);
                    System.out.println("số cần xóa");
                    int xoa = sc1.nextInt();
                    quanLyDanhBa.delete(xoa);
                    break;
            }
        }
    }
}
