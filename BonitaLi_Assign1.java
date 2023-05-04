/*
BonitaLi_Assign1.java is written by B. Li on Sept 9, 2021
It is a simple code displaying a message on the console
*/
import java.util.Scanner; //package import for Scanner class
public class BonitaLi_Assign1 {
	public static void main(String[] args){
		Scanner inData = new Scanner(System.in); //Scanner class object declaration
		String fullName;
		System.out.println("What is your full name?");
		fullName = inData.nextLine();//user input full name
		String highSchool;
		System.out.println("What high school do you attend?");
		highSchool = inData.nextLine();//user input high school
		String favoriteSubject;
		System.out.println("What is your favorite subject?");
		favoriteSubject = inData.nextLine();//user input favorite subject
		String academicGoals;
		System.out.println("Briefly describe your academic goals.");
		academicGoals = inData.nextLine();//user input academic goals
		System.out.println("Name: " + fullName);
		System.out.println("High School: " + highSchool);
		System.out.println("Favorite Subject: " + favoriteSubject);
		System.out.println("Academic Goals: " + academicGoals);//output user information
	}//ends main method
}//class ends