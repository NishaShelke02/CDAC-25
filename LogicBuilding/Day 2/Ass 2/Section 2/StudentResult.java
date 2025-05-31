public class StudentResult {
    public static void main(String[] args) {
        int subject1 = 45; // Change these values as needed
        int subject2 = 30;
        int subject3 = 50;

        int failCount = 0;

        if (subject1 < 40) failCount++;
        if (subject2 < 40) failCount++;
        if (subject3 < 40) failCount++;

        if (failCount == 0) {
            System.out.println("Congratulations! You have passed all subjects.");
        } else {
            System.out.println("You have failed in " + failCount + " subject(s).");
        }
    }
}
