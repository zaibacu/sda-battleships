import java.util.ArrayList;
import java.util.List;

public class Ship implements Hitable{
    private List<Block> blockList = new ArrayList<>();

    public Ship(int x, int y, int length, boolean horizontal){
        int startX = x;
        int startY = y;

        int deltaX = 1;
        int deltaY = 0;
        if(horizontal) {
            deltaX = 1;
            deltaY = 0;
        }
        else {
            deltaX = 0;
            deltaY = 1;
        }

        for(int i = 0; i<length; i++){
            blockList.add(new Block(startX, startY));

            startX += deltaX;
            startY += deltaY;
        }
    }

    public boolean isInside(int otherX, int otherY){
        for(Block b : blockList){
            if(b.isInside(otherX, otherY)){
                return true;
            }
        }

        return false;
    }

    public boolean collides(Ship otherShip){
        for(Block b : blockList){
            if(otherShip.isInside(b.getX(), b.getY()))
                return true;
        }

        return false;
    }

    public Coordinate endCoordinate(){
        Block end = blockList.get(blockList.size() - 1);
        return end.getCoord();
    }
}
