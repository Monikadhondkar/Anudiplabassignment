package adder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface addable{
	
	public void adder(int a,int b);
}

public class adder{

	public static void main(String... args) {
		// TODO Auto-generated method stub

		int width=10;
		 addable d =(x,y)->
		 {
			
			System.out.println(x+y);
		};
		
		d.adder(20,12);
	}

}

