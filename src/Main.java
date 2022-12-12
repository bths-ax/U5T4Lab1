import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your goal in minutes: ");
		int goal = scanner.nextInt();

		ActivityTracker tracker = new ActivityTracker(goal);

		int toLog = 0;
		while (toLog != -1) {
			System.out.print("Enter the number of minutes for your activity session, -1 to end: ");
			toLog = scanner.nextInt();
			if (toLog != -1) {
				tracker.logMinutes(toLog);
			}
		}

		System.out.println();
		System.out.println("Good job being active! Let's look at your stats:");
		System.out.println("Number of sessions: " + tracker.getSessions());
		System.out.println("Total number of minutes: " + tracker.getTotalMinutes());
		System.out.println("Longest session logged (max minutes): " + tracker.getMaxMinutes());
		System.out.println("You reached your goal: " + tracker.goalAchieved());
	}
}
