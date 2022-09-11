import java.util.Scanner;

public class CVvaDT_HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 cạnh của hình vuông ");
        int length = sc.nextInt();

        System.out.println("Chu vi hình vuông là: " + length * 4);
        System.out.println("Diện tích hình vuông là: " + length*length);
    }

}
