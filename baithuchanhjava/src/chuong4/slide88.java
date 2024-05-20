package chuong4;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class slide88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Ho Chi Minh");
        System.out.println("danh sach cac thanh pho : ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QN : " + hashMapCity.get("QN"));
        System.out.println("NT : " + hashMapCity.get("NT"));
        if (hashMapCity.containsValue("Ho Chi Minh")) {
            System.out.println("co thanh pho Ho Chi Minh");
        }
    }
}
