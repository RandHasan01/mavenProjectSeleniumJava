package project.project;

import java.util.Random;

public class TestData {
	String[] TextInput = { "hello world", "automation java", "Hussain HTU Students" };
	String[] Email = { "ahmad@Gmail.com", "Anas@gmail.com", "omar@Gamil.com" };
	String[] Password = { "ASD!@#R", "P@$$w0rd", "ILoveMyMom123" };
	String[] Number = { "962797700235", "962797700236", "962797700237" };
	String[] Date = { "01/01/2025", "05/04/2023", "02/10/1993", "01/25/2002" };
	// String [] Gender = {"male","female"};

	Random rand = new Random();

	int RandomIndexForTheDate = rand.nextInt(Date.length);
	int RandomIndex = rand.nextInt(3);
	// int RandomIndexForGender = rand.nextInt(Gender.length);
	int RandomGender = rand.nextInt(2);

	int RandomHoppy = rand.nextInt(2);

	String RandomText = TextInput[RandomIndex];
	String RandomEmail = Email[RandomIndex];
	String RandomPassword = Password[RandomIndex];
	String RandomNumber = Number[RandomIndex];
	String RandomDate = Date[RandomIndexForTheDate];
	// String RandomGender = Gender[RandomIndexForGender];

	// don't forget to change the path this is on my pc
	String FilePath = "C:\\Users\\Rand Mahmoud\\OneDrive\\Desktop\\mavenProject.txt";

}
