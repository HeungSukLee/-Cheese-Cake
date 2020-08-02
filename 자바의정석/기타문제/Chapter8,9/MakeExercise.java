import java.util.Scanner;

public class MakeExercise {
    //
    public static void main(String[] args) {
        //
        try {
            System.out.print("input boolean value [ true | false ] : ");
            Scanner scanner = new Scanner(System.in);
            boolean input = scanner.nextBoolean();

            System.out.println("Start");
            exceptionCheck(input);
            System.out.println("--------");
            exceptionCheck(!input);
            System.out.println("End");
        } catch (IllegalAccessException e) {
            System.out.println("throw Test : IllegalAccessException of Main Method");
        } catch (NullPointerException e) {
            System.out.println("throw Test : NullPointerException of Main Method");
        }
    }

    private static void exceptionCheck(Boolean check) throws IllegalAccessException {
        //
        if (check) {
            System.out.println("throw Test : IllegalAccessException of Sub Method");
            throw new IllegalAccessException();
        } else {
            System.out.println("throw Test : NullPointerException of Sub Method");
            throw new NullPointerException();
        }
    }
}
