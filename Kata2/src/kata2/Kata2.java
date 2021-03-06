package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {3, 4, 6, 1, 8, 5, 2, 9, 3, 6, 1, 2, 8, 5, 2};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            histogram.put (data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
            
        }
        
        Iterator<Map.Entry<Integer, Integer>> entries  = histogram.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer, Integer> entry =  entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        
        
        
    }
    
}
