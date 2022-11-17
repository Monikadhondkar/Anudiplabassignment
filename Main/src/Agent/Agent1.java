package Agent;
import java.util.ArrayList;
import java.util.Collections;

public class Agent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Agent2> adata=new ArrayList<>(); //create ArrayList 
		
		//add objects of Agent class in ArrayList
		adata.add(new Agent2("Monika",101,"Alandi"));
		adata.add(new Agent2("Prashant",102,"Bhosari"));
		adata.add(new Agent2("Neha",103,"Mumbai"));
		adata.add(new Agent2("Raj",104,"nashik"));
		
		Collections.sort(adata);//sort the adata
		
		//Print ArrayList using for loop
		for(Agent2 a:adata)
		{
			System.out.println("Name:"+a.getName()+"   Id:"+a.getId()+"   Area:"+a.getArea());
		}

	}

}

class Agent2 implements Comparable<Agent2> //using Comparable interface we can sort object of Agent class 
{
	public Agent2(String name, int id, String area) //constructor of Agent class with parameter 
	{
		super();
		this.name = name;
		this.id = id;
		this.area = area;
	}
	private String name;
	private int id;
	private String area;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public int compareTo(Agent2 o)         //This is method of Comparable interface,it provide a single sorting sequence only
	{
		// TODO Auto-generated method stub
		return this.area.compareTo(o.area);  //this method sort area of Agent class
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}