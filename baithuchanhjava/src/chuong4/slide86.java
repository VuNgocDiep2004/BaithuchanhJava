package chuong4;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class slide86 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cslt", "co so lap trinh");
        hashMap.put("c++", "c++");
        hashMap.put("c#", "c sharp");
        hashMap.put("php", "php");
        hashMap.put("java", "java");
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("cac entry co trong setHashMap : ");
        System.out.println(setHashMap);
    }
}
