public class Block implements Hitable{
    private int x;
    private int y;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInside(int otherX, int otherY){
        return this.x == otherX && this.y == otherY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate getCoord(){
        return new Coordinate(x, y);
    }
}
