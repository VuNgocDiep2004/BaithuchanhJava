import java.util.Scanner;

public class Person {
    public String fullname;
    public int sotuoi;
    public float chieucao;

    public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("ho va ten : ");
    fullname = sc.nextLine();
    System.out.print("tuoi : ");
    sotuoi = sc.nextInt();
    System.out.print("chieu cao : ");
    chieucao = sc.nextFloat();
    
    }

    public Person(String name){
      fullname = name;
      sotuoi = 20;
      chieucao = 170;
        }

    public void thongtincanhan(){
    System.out.println("ho va ten : " + fullname);
    System.out.println("tuoi : " + sotuoi);
    System.out.println("chieu cao : " + chieucao + " cm");
    }
        
}
