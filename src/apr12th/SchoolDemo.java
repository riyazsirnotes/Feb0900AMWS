package apr12th;

public class SchoolDemo {

	public static void main(String[] args) {
		
		//Student s1=new Student();
		
		//Marks s1=new Marks();
		
		Leave s1=new Leave();
		
		s1.setDetails(1, "John");
		
		s1.getDetails();
		
		s1.setMarks(80, 90, 80);
		
		s1.getResults();
		
		s1.setLeaves(5, 6);
		
		s1.getLeaves();
		
		

	}

}
