import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by sudhakar on 1/22/17.
 */
public class HashDemos {
    public static void main(String args[]){
        /*
            - for each -> either by keys or values
            - using iterator -> Create an iterator on the Map
            - entry -> foreach on the entryset
            - entry -> iterate on the entryset
         */

        Map<Integer, String> mapvalues = new HashMap<>();
        mapvalues.put(1,"HI");
        mapvalues.put(2,"Bye");

        // Method - 1 using foreach of keys and foreach of values
        System.out.println("Method-1: using Foreach");
        for(Integer keys: mapvalues.keySet()){
            System.out.println(mapvalues.get(keys));
        }
        for(String values : mapvalues.values()){
            System.out.println(values);
        }

        // Method - 2: using iterator
        System.out.println("Method-2: using Iterator");
        Set keyset = mapvalues.keySet();
        Iterator iter = keyset.iterator();
        while(iter.hasNext()){
            System.out.println(mapvalues.get(iter.next()));
        }

        // Method - 3: using entrySet - foreach
        System.out.println("Method-3: using entryset foreach");
        Set<Map.Entry<Integer, String>> entries = mapvalues.entrySet();
        for(Map.Entry entry: entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Method - 4: using entryset - iterator
        System.out.println("Method-4: using entryset Iterator");
        Set<Map.Entry<Integer, String>> entries2 = mapvalues.entrySet();
        Iterator<Map.Entry<Integer, String>> entryIter = entries2.iterator();
        while(entryIter.hasNext()){
            System.out.println(entryIter.next().getKey());
            System.out.println(entryIter.next().getValue());
        }
    }
}
