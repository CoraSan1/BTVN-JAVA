import java.util.Scanner;

public class ChuyenThuongThanhHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi chữ muốn đổi: ");
        String chu = sc.nextLine();

        System.out.println("chuỗi chữ thường: "+chu);

        // in ra chữ hoa

        System.out.println("Chuỗi đã thay đổi về chữ hoa: " + chu.toUpperCase());
    }
}
