public class ConsoleUIImpl implements UI{
    @Override
    public void displayMessage(String msg, Object... args) {
        System.out.printf(msg + "\n", args);
    }
}
