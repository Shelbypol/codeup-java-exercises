package collectionsLecture;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        //way to check that username is unique
        //if userid contains key then have them try again

        HashMap<String, Integer> userIds = new HashMap<>();
        HashMap<String, String> passwords = new HashMap<>();
        HashMap<Integer, String> horses = new HashMap<>();

        userIds.put("Skurihara", 1);
        userIds.put("jreich", 2);
        userIds.put("Shelbypol", 3);
        userIds.putIfAbsent("jreich5", 4); //only checks key (this will add) //ensuring unique values inside hash map

        userIds.replace("Skurihara", 7);
        System.out.println(userIds);
        System.out.println(userIds.containsKey("dstephens"));
        System.out.println(userIds.containsValue(3));
        System.out.println(userIds.getOrDefault("dstephens", 5));
        System.out.println(userIds.get("jreich"));
        userIds.remove("Shelbypol");
        System.out.println(userIds);

        userIds.clear();
        System.out.println(userIds);



    }


}
