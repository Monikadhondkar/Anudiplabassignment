package LabAssignment7;       //QuestionNo:02
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Student //   student class declare
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
		public Student (int id, String name, int age, int maths_marks)  // parameterized constructor
		{
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			Maths_marks = maths_marks;
		}
		public Student () // constructor super class
		{
		}


				public class MinMaxAPI 
				{

					public static void main(String[] args) 
					{
						List<Student > stud = new ArrayList<>();  // array list
						stud.add(new Student (1,"monika",22,75));
						stud.add(new Student (2,"neha",22,79));
						stud.add(new Student (3,"Pratik",24,80));
						stud.add(new Student (4,"riya",21,16));
						stud.add(new Student (5,"siya",22,58));
						stud.add(new Student (6,"tina",22,100));
						
						System.out.println("Maximum Marks :");// use max function
						Student  SMax = stud.stream().max((stud1,stud2)->stud1.getMaths_marks()>stud2.getMaths_marks()?1:-1).get();
						System.out.println(SMax.getId()+" "+SMax.getName()+" "+SMax.getMaths_marks());
						
						
						
						System.out.println("Minimum Marks :"); // use min function
						Student  SMin = stud.stream().min((stud1,stud2)->stud1.getMaths_marks()>stud2.getMaths_marks()?1:-1).get();
						System.out.println(SMin.getId()+" "+SMin.getName()+" "+SMin.getMaths_marks());

					}

				}		
		
		
	}





