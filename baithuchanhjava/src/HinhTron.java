import java.util.Scanner;

public class HinhTron {
        public float bankinh;
        public float chuvi;
        public float dientich;
        public final float pi = 3.14f;

        void nhapbankinh() {
            Scanner sc = new Scanner(System.in);
            System.out.print("R = " );
            bankinh = sc.nextFloat();
        }
        void tinhchuvi() {
            chuvi = 2 * pi * bankinh;
        }
        void tinhdientich() {
            dientich = pi * bankinh * bankinh;
        }
        void inchuvi() {
            System.out.println("chu vi = " + chuvi);
        }
        void indientich() {
            System.out.println(" dien tich = " + dientich);
        }
}
