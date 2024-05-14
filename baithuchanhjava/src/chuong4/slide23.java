package chuong4;
import java.util.ArrayList;
import java.util.Scanner;
public class slide23 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so phan tu = ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
          System.out.print("nhap phan tu thu " + i + ": ");
          number = sc.nextInt();
          arrayListIntegers.add(number);
    }
        int max = arrayListIntegers.get(0);
        for(int i = 0; i < arrayListIntegers.size(); i++) {
        if (arrayListIntegers.get(i).compareTo(max) > 0) {
           max = arrayListIntegers.get(i);
        }
    }
    System.out.println("phan tu lon nhat = " + max);
}
}