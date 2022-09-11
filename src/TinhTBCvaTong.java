import java.util.Arrays;
import java.util.Scanner;

public class TinhTBCvaTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập các số: ");
        int [] a = new int[5];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            count++;
            sum += a[i];
        }

        System.out.print("Tổng các số là; " + sum);

        double tbc = sum/count;
        System.out.print("\n Trung bình cộng các số là: " + tbc);
    }
}
