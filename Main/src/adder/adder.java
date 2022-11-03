package adder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// functional interface
interface Addition  // 
{
	public int Adder(int x, int y);
}

public class adder 
{

	public static void main(String[] args) 
	{
			List<String> name=new ArrayList<String>(); // array list
		name.add("Monika");
		
		name.forEach((m)->  // lambda expression
		{
			System.out.println(m.toUpperCase());  // use UpperCase method
			
		});
		
		Addition a=(n,m)->  // lambda expression
		{
			return n+m;
		};
		
		System.out.println(a.Adder(7, 5));
		
		
	}

}

