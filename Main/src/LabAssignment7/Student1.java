package LabAssignment7;    //Question no:01
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Student1 //   student class declare
{
		private int id;
		private String name;
		private int age;
		private int Maths_marks;
		
		
		// use Getter setter Method
		public int getId() 
		{
			return id;
		}
		public void setId(int id)
		{
			this.id = id;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public int getAge() 
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public int getMaths_marks() 
		{
			return Maths_marks;
		}
		public void setMaths_marks(int maths_marks) 
		{
			Maths_marks = maths_marks;
		}
		public Student1(int id, String name, int age, int maths_marks)  // parameterized constructor
		{
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			Maths_marks = maths_marks;
		}
		public Student1() // constructor super class
		{
			
		}
		
		
	}

	 class StudentFilter 
	{

		public static void main(String[] args)
		{
			List<Student1> stud = new ArrayList<>();
			stud.add(new Student1(1,"monika",22,75));
			stud.add(new Student1(2,"neha",22,79));
			stud.add(new Student1(3,"Pratik",24,80));
			stud.add(new Student1(4,"riya",21,16));
			stud.add(new Student1(5,"siya",22,58));
			stud.add(new Student1(6,"tina",22,100));
			
			System.out.println("Student Marks :");
			stud.stream().forEach(j->System.out.println(j.getId()+" "+j.getName()+" "+j.getAge()+" "+j.getMaths_marks()));
			
			System.out.println("Student get Marks in Maths in between 60 to 80 :");
			stud.stream().filter(s->s.getMaths_marks()>60&&s.getMaths_marks()<80).forEach(p->System.out.println(p.getId()+" "+p.getName()+" "+p.getMaths_marks()));
			
		}

}
