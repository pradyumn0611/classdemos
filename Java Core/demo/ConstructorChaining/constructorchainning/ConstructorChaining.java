package constructorchainning;

public class ConstructorChaining {
	String name;
	int id;
	ConstructorChaining()
	{//this will call parameterised constructor with  parameter
		this("pradyumn joshi");
		
	}
	ConstructorChaining(String name)
	{
		
		this(name,11);
		
	}
	ConstructorChaining(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining();
		System.out.println(cc.name);
	}
		
		


}
