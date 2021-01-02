import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
public static void main(String args[])
{
	ArrayList<Integer> value=new ArrayList<>();
	value.add(100);
	value.add(220);
	value.add(90);
	value.add(140);
	System.out.println(value);
	
	Comparator<Integer> com=new ComImpl();
	//with lambda implementation 
	/*Collections.sort(value,(o1,o2) ->
	{
		return o1%100 >o2%100?1:-1;
	});
	*/
	Collections.sort(value,com );
	
	
	for(int i :value)
	{
		System.out.println(i);
	}
	
	}
}
