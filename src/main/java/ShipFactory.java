import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipFactory {
    private static Random random = new Random();

    private static Ship createShip(int length, int width, int height){
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        boolean isHorizontal = random.nextBoolean();

        return new Ship(x, y, length, isHorizontal);
    }

    public static List<Ship> generateShips(int width, int height, int resources) {
        ShipValidator validator = new ShipValidator(width, height);
        List<Ship> shipList = new ArrayList<>();
        while(resources > 7){
            int shipLength = Math.min(resources, random.nextInt(3) + 2);
            Ship newShip = createShip(shipLength, width, height);
            if(validator.isValid(newShip, shipList)){
                shipList.add(newShip);
                resources -= shipLength;
            }
        }
        int shipLength = Math.min(resources, random.nextInt(3) + 2);
        shipList.add(createShip(shipLength, width, height));
        shipList.add(createShip(resources - shipLength, width, height));
        return shipList;
    }
}
