import java.util.Arrays;
import java.util.Scanner;

public class DemkyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[9];
        System.out.print("nhập các ký tự số: ");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int count = 0;

        System.out.print("Nhập ký tự muốn đếm: ");
        int b = sc.nextInt();
        for (int i = 0; i < a.length; i++){
            if (a[i] == b){
                count++;
            }
        }
        System.out.println("Có " + count + " ký tự " + b);
    }
}
