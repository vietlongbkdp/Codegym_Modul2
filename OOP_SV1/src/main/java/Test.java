import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//    SinhVien sv1 = new SinhVien("MSV1", "Nguyễn Viết Long", 1997, 9.1);
//    SinhVien sv2 = new SinhVien("MSV2", "Hàng Quốc Đạt", 1997, 9.5);
//    SinhVien sv3 = new SinhVien("MSV3", "Lê Tấn Vinh", 1996, 7.9);
//    SinhVien sv4 = new SinhVien("MSV4", "Trần Kim Tấn", 1998, 6.3);
//
//    DanhSachSinhVien DS1 = new DanhSachSinhVien();
//    DS1.addSinhVien(sv1);
//    DS1.addSinhVien(sv2);
//    DS1.addSinhVien(sv3);
//    DS1.addSinhVien(sv4);
//    DS1.inDSSinhVien();
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập MSSV: ");
//        String mssv = input.nextLine();
//        System.out.println("Nhập Tên Sinh Viên: ");
//        String tenSV = input.nextLine();
//        System.out.println("Nhập Năm Sinh: ");
//        int namSinh = input.nextInt();
//        System.out.println("Nhập Điểm Trung Bình: ");
//        Double diemTB = input.nextDouble();
//        SinhVien sv1 = new SinhVien(mssv, tenSV, namSinh, diemTB);
//        DanhSachSinhVien DS1 = new DanhSachSinhVien();
//        DS1.addSinhVien(sv1);
//        DS1.inDSSinhVien();
        Scanner input = new Scanner(System.in);
        DanhSachSinhVien DS1 = new DanhSachSinhVien();
        int index = 0;
        do {
        System.out.println("-------------MENU-------------");
        System.out.println("1: Thêm sinh viên vào danh sách.");
        System.out.println("2: Kiểm tra danh sách có rỗng hay không.");
        System.out.println("3: Lấy ra số lượng sinh viên trong danh sách.");
        System.out.println("4: Làm rỗng danh sách sinh viên.");
        System.out.println("5: Kiểm tra sinh viên có tồn tại trong danh sách không.");
        System.out.println("6: Xoá một sinh viên khỏi danh sách.");
        System.out.println("7: Tìm kiếm một sinh viên dựa trên tên");
        System.out.println("8: Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
        System.out.println("0: Exit.");
        index = input.nextInt();
        input.nextLine();
            if(index == 1){
                System.out.println("Nhập MSSV: ");
                String mssv = input.nextLine();
                System.out.println("Nhập Tên Sinh Viên: ");
                String tenSV = input.nextLine();
                System.out.println("Nhập Năm Sinh: ");
                int namSinh = input.nextInt();
                System.out.println("Nhập Điểm Trung Bình: ");
                double diemTB = input.nextDouble();
                SinhVien sv = new SinhVien(mssv, tenSV, namSinh, diemTB);
                DS1.addSinhVien(sv);
                DS1.inDSSinhVien();
            }
            else if(index == 2){
                System.out.println(DS1.kiemTraDanhSachRong());
            }
            else if(index == 3){
                System.out.println(DS1.kiemTraSoLuongPhanTu());
            }
            else if(index == 4){

            }
            else if(index == 5){

            }
            else if(index == 6){

            }
            else if(index == 7){

            }
            else if(index == 8){

            }
        }while (index!=0);
    }
}
