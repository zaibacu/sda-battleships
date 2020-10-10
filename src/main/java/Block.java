public class Block {
    private int x;
    private int y;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInside(int otherX, int otherY){
        return this.x == otherX && this.y == otherY;
    }
}
