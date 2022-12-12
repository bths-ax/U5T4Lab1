public class ActivityTracker {
	private int goalMinutes;
	private int totalMinutes;
	private int maxMinutes;
	private int sessions;

	public ActivityTracker(int goalMinutes) {
		this.goalMinutes = goalMinutes;
		this.totalMinutes = 0;
		this.maxMinutes = 0;
		this.sessions = 0;
	}

	public int getTotalMinutes() { return totalMinutes; }
	public int getMaxMinutes() { return maxMinutes; }
	public int getSessions() { return sessions; }

	public void logMinutes(int minutes) {
		totalMinutes += minutes;
		maxMinutes = Math.max(maxMinutes, minutes);
		sessions++;
	}

	public boolean goalAchieved() {
		return totalMinutes >= goalMinutes;
	}
}
