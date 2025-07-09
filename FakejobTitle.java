import java.util.Random;
import java.util.Scanner;

public class FakejobTitle {
    public static void main(String[] args) {
        String[] descriptors = {
            "Quantum", "Digital", "Dynamic", "Innovative", "Synergy", "Strategic",
            "Epic", "Visionary", "Virtual", "Magnetic"
        };
        String[] jobTitles = {
            "Manager","Engineer","Developer","Designer","Analyst","Consultant","Coordinator","Specialist","Technician","Advisor"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            int descIndex = random.nextInt(descriptors.length);
            int titleIndex = random.nextInt(jobTitles.length);

            String generatedTitle = descriptors[descIndex] + " " + jobTitles[titleIndex];

            System.out.println("Your fake job title is: " + generatedTitle);

            System.out.print("Generate another? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}