import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
	public static  void main(String[] args)
	{
		ArrayList<Comparableimpl> value=new ArrayList<Comparableimpl>();
		value.add(new Comparableimpl(100));
		value.add(new Comparableimpl(220));
		value.add(new Comparableimpl(111));
		value.add(new Comparableimpl(121));
		value.add(new Comparableimpl(196));
		
		System.out.println(value);
		
		//with lambda implementation 
		/*Collections.sort(value,(o1,o2) ->
		{
			return o1%100 >o2%100?1:-1;
		});
		*/
		Collections.sort(value);//there will be hashcode in value
		
		
		for(Comparableimpl i :value)
		{
			System.out.println(i.number);
		}
		
	}

}
