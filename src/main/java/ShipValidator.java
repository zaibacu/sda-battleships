import java.util.List;

public class ShipValidator {
    private int width;
    private int height;

    public ShipValidator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean isValid(Ship ship, List<Ship> otherShips){
        Coordinate coord = ship.endCoordinate();
        if(coord.getX() > width)
            return false;

        if(coord.getY() > height)
            return false;

        for(Ship other : otherShips){
            if(ship.collides(other))
                return false;
        }
        return true;
    }
}
