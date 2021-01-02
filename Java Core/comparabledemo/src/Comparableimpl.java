
public class Comparableimpl implements Comparable<Comparableimpl> {
	int number;
	Comparableimpl(int number)
	{
		this.number=number;
	}

	@Override
	public int compareTo(Comparableimpl o) {
		return number%10>o.number?-1:number%10<o.number%10?1:0;
	}

	

	

	
	

}
