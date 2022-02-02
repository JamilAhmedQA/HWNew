package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		aboutMe.name = "Jamil"; // Variables initialized
		aboutMe.age = 25;
		aboutMe.myMonthlyHouseRent = 1500;
		aboutMe.myYearlyIncome = 80000;
		aboutMe.height = 5.8f;
		aboutMe.myGrade = 4.25;
		aboutMe.sex = 'M';
		aboutMe.phoneNumber = 929_278_0358l;
		aboutMe.usCitizen = true;
		aboutMe.aboutMe(); // method initialized

		System.out.println("\n*************************************\n");
		System.out.println("This is all about my best friend Alex");
		aboutMe.name = "Alex"; // variables initialized
		aboutMe.age = 30;
		aboutMe.myMonthlyHouseRent = 1200;
		aboutMe.myYearlyIncome = 70000;
		aboutMe.height = 6.5f;
		aboutMe.myGrade = 3.25;
		aboutMe.sex = 'M';
		aboutMe.phoneNumber = 929_278_0858l;
		aboutMe.usCitizen = false;
		aboutMe.aboutMe(); // method initialized

	}

}
