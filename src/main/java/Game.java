import java.util.List;

public class Game {
    public static void main(String[] args) {
        PlayerInput playerInput = new ConsolePlayerInputImpl();
        UI ui = new ConsoleUIImpl();
        List<Ship> shipList = ShipFactory.generateShips(7, 10);

        ui.displayMessage("Number of ships: %d\n", shipList.size());

        Coordinate attackCoordinate = playerInput.askForCoordinate("Enter coordinate to attack");
        boolean isHit = false;

        for(Ship s : shipList){
            if(s.isInside(attackCoordinate.getX(), attackCoordinate.getY())){
                isHit = true;
                break;
            }
        }

        if(isHit){
            ui.displayMessage("Hit!");
        }
        else {
            ui.displayMessage("Miss.");
        }
    }
}
