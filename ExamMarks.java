package javaLab;

public class ExamMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 60;
		
		if(marks> 90)
		{
			System.out.print("Grade A");	
		}
		else if(marks > 70)
		{
			System.out.print("Grade B");
		}
		else if(marks > 50)
		{
			System.out.print("Grade C");
		}
		else if(marks > 30)
		{
			System.out.print("Fail");
		}

	}

}