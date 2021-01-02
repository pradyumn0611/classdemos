import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapHashSet {
	int empId;
	
	HashMapHashSet(int empId)
	{
		this.empId=empId;
	}
	
	public static void main(String args[])
	{
		//Hashset: no duplicacy , unordered , single null value
		//uses hashing technique
		HashSet<Integer> hashset=new HashSet<>();
	
	System.out.println("HashSet :");
	
		hashset.add(11376);
		hashset.add(11377);
		hashset.add(11378);
		
		System.out.println(hashset);
		
		hashset.add(11376);

		System.out.println(hashset);
		
		hashset.add(114576);
		hashset.add(1454576);
		
		System.out.println(hashset);
		
		hashset.add(null);
		
		System.out.println(hashset);
		
		hashset.add(null);
		
		System.out.println(hashset);
		
		System.out.println("HashMap  :");
		//HashMap: duplicacy allowed with values not keys.
		//single null key value many for value
		//uses hashmap object
		HashMap<String,String> hashmap=new HashMap<>();
		
		hashmap.put("name", "pradyumn");
		hashmap.put("place", "indore");
		hashmap.put("employer", "yash");
		
		System.out.println(hashmap);
		
		hashmap.put(null, "india");
		System.out.println(hashmap);
		hashmap.put(null, "china");
		
		System.out.println(hashmap);
		
		hashmap.put("name", "mayank");
		
		System.out.println(hashmap);
		
		Set<String>keys=hashmap.keySet();
		for (String key:keys)
		{
			System.out.println(key);
		}
	}

}
