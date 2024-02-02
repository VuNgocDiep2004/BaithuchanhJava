import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên cần nhập: ");
        int n = scanner.nextInt();
        int[] soNguyen = new int[n];
        double tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập số nguyên thứ %d: ", i + 1);
            soNguyen[i] = scanner.nextInt();
            tong += soNguyen[i];
        }
        double trungBinhCong = tong / n;
        System.out.printf("Trung bình cộng của %d số nguyên đã nhập là: %.2f%n", n, trungBinhCong);
    }
}