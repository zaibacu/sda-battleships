import java.util.Scanner;

public class ConsolePlayerInputImpl implements PlayerInput{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Coordinate askForCoordinate(String msg) {
        System.out.println(msg + ": ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        return new Coordinate(x, y);
    }
}
