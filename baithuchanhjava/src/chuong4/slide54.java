package chuong4;
import java.util.HashSet;
import java.util.Scanner;
public class slide54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(1);
        hashSetIntegers.add(4);
        hashSetIntegers.add(2);
        hashSetIntegers.add(8);
        System.out.print("cac phan tu trong hashSetIntegers : ");
        System.out.println(hashSetIntegers);
        System.out.print("nhap phan tu can them : ");
        number = sc.nextInt();
        if (!hashSetIntegers.contains(number)) {
            hashSetIntegers.add(number);
            System.out.println("them thanh cong");
            System.out.print("cac phan tu trong hashSetIntegers sau khi them : ");
            System.out.println(hashSetIntegers);
        } 
       else {
            System.out.println("phan tu " + number + " da ton tai");
        }

    }
}
