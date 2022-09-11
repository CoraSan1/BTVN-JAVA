import java.util.Scanner;

public class DT_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài HCN ");
        int length = sc.nextInt();
        System.out.print("Nhập chều rộng HCN");
        int width = sc.nextInt();

        System.out.println("Diện tích hình chữ nhật là " + length * width);
    }
}
