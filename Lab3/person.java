package Lab3;
import java.util.Scanner;
public class person {
    public String hoTen;
    public int tuoi;
    public String diaChi;

    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        
    }
    public void xuatThongTin()
    {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("Tuoi: " + tuoi);
    }
    public person()
    {
        hoTen = "Vu Ngoc Diep";
        diaChi = "Ha Noi";
        tuoi = 20;
    }
}
