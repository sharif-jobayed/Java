package commonDS_01;

import java.util.HashMap;
import java.util.Map;

public class HashMap_DS {
    private HashMap<Integer, String> hashMap_01;
    private HashMap<String, Double> hashMap_02;

    public HashMap_DS() {
        this.hashMap_01 = new HashMap<>();
        this.hashMap_02 = new HashMap<>(Map.of(
                "One",1.0,
                "Two",2.0,
                "Three",3.0,
                "Four",4.0,
                "Five",5.0
        ));
    }

    private void setHashMap_01() {
        for(int i = 0; i < 10; i++) {
            this.hashMap_01.put(i, "Value: "+i);
        }
    }

    public void loopThroughHashMap_01() {
        for(Map.Entry<Integer, String> entry : this.hashMap_01.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        HashMap_DS hashMapDs = new HashMap_DS();

        // hashMap_01
        hashMapDs.setHashMap_01();
        System.out.println("The items in the hashMap_01 are: "+hashMapDs.hashMap_01);
        System.out.println("The 4th item is: "+hashMapDs.hashMap_01.get(4));

        // // hashMap_02
        System.out.println("The items in the hashMap_02 are: "+hashMapDs.hashMap_02);
        System.out.println("The 2nd item is: "+hashMapDs.hashMap_02.get("Two"));

        hashMapDs.loopThroughHashMap_01();
    }
}
