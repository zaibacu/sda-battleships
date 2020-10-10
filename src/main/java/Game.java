import java.util.List;

public class Game {
    public static void main(String[] args) {
        PlayerInput playerInput = new ConsolePlayerInputImpl();
        UI ui = new ConsoleUIImpl();
        GameConfig config = GameConfig.load();
        List<Ship> shipList = ShipFactory.generateShips(config.getWidth(), config.getHeight(), config.getResources());

        ui.displayMessage("Number of ships: %d\n", shipList.size());

        while(true){
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
}
