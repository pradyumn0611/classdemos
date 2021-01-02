package stringbufferbuilder;



public class StringBuilderBuffer {
	public void strNormal(String str)
	{
		str=str+"Joshi";
	}
	public void strBuilder(StringBuilder builder)
	{
		builder.append("Joshi");
	}
	public void strBuffer(StringBuffer buffer)
	{
		buffer.append("Joshi");
	}
	public static void main(String[] args)
	{
		StringBuilderBuffer sbb=new StringBuilderBuffer();
		String s1="Pradyumn";
		//calling only string
		sbb.strNormal(s1);
		System.out.println(s1);
		//will not change as strings are immutable
		
		StringBuilder sb=new StringBuilder("Pradyumn ");
		sbb.strBuilder(sb);
		System.out.println(sb);
		//willchange. but it will be good yo work on one thread only . NOT THREAD SAFE.
		
		StringBuffer bff=new StringBuffer("Pradyumn ");
		sbb.strBuffer(bff);
		System.out.println(bff);
		//Its Thread safe.
		
	}

}
