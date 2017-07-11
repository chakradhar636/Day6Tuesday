import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Assign1 {

    public static void main(String[] args) {

//Map is used to store key:value object pairs
//HashMap doesn't follow any order, hence there is no guarantee for the order
//In HashMap elements are stored by using Hashing technique on the key objects
//Tree Map stores elements in ascending order of keys
        Map tm1 = System.getenv();
        //tm1.put("hhhhhhh","jfhsgfdjusgfsd");





        Set s= tm1.entrySet();

        //Now s is Set having all the Entry

        Iterator itr1 = s.iterator();
        while(itr1.hasNext())
        {
            Map.Entry me = (Map.Entry)itr1.next();
            System.out.println("Key:"+me.getKey()+" "+"value:"+me.getValue());
        }

        return;
    }
}
