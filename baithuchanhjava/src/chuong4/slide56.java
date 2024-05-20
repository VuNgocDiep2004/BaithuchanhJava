package chuong4;
import java.util.HashSet;
import java.util.Scanner;
public class slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        System.out.print("cac phan tu trong hashSetString : ");
        System.out.println(hashSetString);
        System.out.print("nhap phan tu can xoa : ");
        name = sc.nextLine();
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("xoa thanh cong");
            System.out.print("cac phan tu trong hashSetString : ");
            System.out.print(hashSetString);
        }
        else {
            System.out.println("xoa khong thanh cong");
        }
    }
}
