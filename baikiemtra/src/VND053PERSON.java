
import java.util.Scanner;
import java.util.LinkedList;
public class VND053PERSON {
public static void main(String[] args) throws Exception {
String name;
int tuoi;
double diem;
Scanner sc = new Scanner(System.in);
public void nhapthongtin () {
    System.out.println("nhap ten : ");
    name = sc.nextLine();
    System.out.println("nhap tuoi : ");
    tuoi = sc.nextInt();
    System.out.println("nhap diem");
    diem = sc.nextDouble();
}
public void xuatthongtin () {
    System.out.println("ho va ten : " + name);
    System.out.println("tuoi : " + tuoi);
    System.out.println("diem : " + diem);
}
}
}
