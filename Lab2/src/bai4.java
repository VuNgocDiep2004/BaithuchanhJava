import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên từ 1 - 12: ");
        int monthNumber = scanner.nextInt();

        switch(monthNumber) {
            case 1:
                System.out.println("Tháng: Tháng Một");
                break;
            case 2:
                System.out.println("Tháng: Tháng Hai");
                break;
            case 3:
                System.out.println("Tháng: Tháng Ba");
                break;
            case 4:
                System.out.println("Tháng: Tháng Tư");
                break;
            case 5:
                System.out.println("Tháng: Tháng Năm");
                break;
            case 6:
                System.out.println("Tháng: Tháng Sáu");
                break;
            case 7:
                System.out.println("Tháng: Tháng Bảy");
                break;
            case 8:
                System.out.println("Tháng: Tháng Tám");
                break;
            case 9:
                System.out.println("Tháng: Tháng Chín");
                break;
            case 10:
                System.out.println("Tháng: Tháng Mười");
                break;
            case 11:
                System.out.println("Tháng: Tháng Mười Một");
                break;
            case 12:
                System.out.println("Tháng: Tháng Mười Hai");
                break;
            default:
                System.out.println("Nhập vào không hợp lệ. Vui lòng nhập một số từ 1 đến 12.");
        }

        scanner.close();
    }
}