package week1Day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> empIds = new HashMap<>();
		
		
		empIds.put("Ald", 12345);
		empIds.put("Bran", 54321);
		empIds.put("Alz", 867530);
		empIds.put("Arf", 11192000);
		
		System.out.println(empIds);
		
		boolean hasKey = empIds.containsKey("Arf");
		System.out.println(hasKey);
		empIds.putIfAbsent("ralph", 333);
		System.out.println(empIds);
		empIds.remove("ralph");
		System.out.println(empIds);
		
		System.out.println(empIds.keySet());
		Iterator<String> iterator = empIds.keySet().iterator();
		while(iterator.hasNext())
		{
			String key = iterator.next();
			int val = empIds.get(key);
			System.out.println(key + "\t: \t" + val);
		}
		
		for(String str: empIds.keySet())
		{
			System.out.println(str + "\t:\t" + empIds.get(str));
		}
		
		Iterator<Integer> iterator1 = empIds.values().iterator();
		
		while(iterator1.hasNext()) {
			int nextValue = iterator1.next();
			System.out.println(nextValue);
			
			Iterator <Map.Entry<String, Integer>> iterator2 = empIds.entrySet().iterator();
			while(iterator2.hasNext()) {
				Map.Entry<String, Integer> entry = iterator2.next();
				String key = entry.getKey();
				int value = entry.getValue();
				System.out.println(key + " " + value);
			}
			for(Map.Entry<String, Integer> entry: empIds.entrySet()) {
				String key = entry.getKey();
				int value = entry.getValue();
				System.out.println(key + " " + value);
			}
		}
	}
	
}
