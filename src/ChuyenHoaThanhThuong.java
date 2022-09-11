import java.util.Scanner;

public class ChuyenHoaThanhThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chữ muốn đổi: ");
        String chu = sc.nextLine();
        System.out.println("chuỗi chữ hoa: "+chu);

        // in ra chữ thường

        System.out.println("Chuỗi đã thay đổi về chữ thường: "+chu.toLowerCase());
    }
}
