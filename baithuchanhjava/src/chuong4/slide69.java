package chuong4;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class slide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetInteger.add(0);
        treeSetInteger.add(1);
        treeSetInteger.add(2);
        treeSetInteger.add(3);
        treeSetInteger.add(4);
        treeSetInteger.add(6);
        System.out.print("cac phan tu trong treeSetInteger : ");
        System.out.println(treeSetInteger);
        System.out.print("nhap vao tu can them : ");
        number = sc.nextInt();
        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.print("cac phan tu trong treeSetInteger sau khi them : ");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("phan tu " + number + " da ton tai");
        }
    }
}
