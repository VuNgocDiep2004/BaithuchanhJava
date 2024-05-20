package chuong3;

import chuong3.animal.animal;
import chuong3.animal.bird;
import chuong3.animal.fish;

public class vd2 {
    public static void main(String[] args) {
        animal an1 = new fish();
        an1.Move();
        an1.Eat();
        animal an2 = new bird();
        an2.Move();
        an2.Eat();

    }
}
