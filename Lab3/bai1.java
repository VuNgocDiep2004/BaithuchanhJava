package Lab3;
import Lab3.hinhhoc;
import Lab3.hinhtron;
import Lab3.hinhtru;
import Lab3.hinhchunhat;
import Lab3.hinhvuong;
public class bai1 {
public static void main(String[] args) {
        hinhtron htron  = new hinhtron();
        htron.xuatten();
        htron.nhapbankinh();
        htron.tinhchuvi();
        htron.tinhdientich();
        htron.inchuvi();
        htron.indientich();
        hinhtru htru = new hinhtru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthetich();
        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
        hinhvuong hv = new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }   
}
