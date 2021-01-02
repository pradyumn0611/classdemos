package mycollectionex;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MyCollectionEx {
	public static <E> void main(String args[]) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("pradyumn");
		a.add("prakhar");
		a.add("pranav");
		a.add("pratyush");
		a.add("praveen");
		System.out.println(0);
		System.out.println(a.contains("pradyumn"+ "its size is"+a.size()));
		for(String data:a)
			System.out.println(data);
		System.out.println(a.contains("praveen"));
		a.remove("praveen");
		for(String data:a)
			System.out.println(data);
		a.clear();
		for(String data:a)
			System.out.println(data);
		System.out.println(a.contains("pradyumn"));
		
		//order is not fixed, duplicates not allowed
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("java");
		hashset.add("python");
		hashset.add("javascript");
		System.out.println(hashset);
		hashset.add("c");
		hashset.add("ruby");
		System.out.println(hashset);
		
		//treeset is implementation of sorted set
		//no duplication 
		TreeSet <String> treeset=new  TreeSet <String> ();
		treeset.add("b");
		treeset.add("b");
		treeset.add("z");
		treeset.add("d");
		System.out.println(treeset);
	}
}
