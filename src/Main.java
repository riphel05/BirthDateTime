import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMin = 0;

        Scanner in = new Scanner(System.in);

        birthYear = SafeInput.getRangedInt(in, "What year were you born?", 1950,2010);
            System.out.println("You said your birth year is: " + birthYear);
        birthMonth = SafeInput.getRangedInt2(in, "What month were you born?", 1, 12);
            System.out.println("You said your birth month is: " + birthMonth + " in the year " + birthYear);
        birthDay = SafeInput.getRangedInt3(in, "What day were you born?", 1, 31);
            System.out.println("You said you were born on the " + birthDay + "of " + birthMonth + " in the year " + birthYear);
        birthHour = SafeInput.getRangedInt4(in, "What was the hour of your birth?", 1, 12);
            System.out.println("You said you were born on the " + birthHour + " hour.");
        birthMin = SafeInput.getRangedInt5(in, "What was the minutes of your birth?", 0, 59);
        System.out.println("You were born on the " + birthMin + "on the " + birthHour + " hour.");
    }
}