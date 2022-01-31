public class Tank {
    public enum Dir {SOUTH, NORTH, WEST, EAST}
    private static final int defaultFuel = 100;
    int x;
    int y;
    Dir dir;
    int fuel;
    public Tank() {
        this(0, 0, defaultFuel);
    }

    public Tank(int x, int y) {
        this(x,y, defaultFuel);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.dir = Dir.EAST;
        this.fuel = fuel;
    }


    public void goForward(int value) {
        if (value >= this.fuel) {
            value = this.fuel;
        }
        this.move(value);
        this.fuel -= value;
    }

    public void goBackward(int value) {
       if (value >= this.fuel) {
            value = this.fuel;
        }
        this.move(-value);
        this.fuel += value;
    }

    private void move(int value) {
        switch (this.dir) {
            case SOUTH -> this.y += value;
            case EAST -> this.x += value;
            case NORTH -> this.y -= value;
            case WEST -> this.x -= value;
        }
    }

    public void printPosition() {
        System.out.printf("The Tank is at %d, %d now.\n", this.x, this.y);
    }
    public void turnRight() {
       switch(this.dir) {
           case SOUTH:
               this.dir = Dir.WEST;
               break;
           case EAST:
               this.dir = Dir.SOUTH;
               break;
           case NORTH:
               this.dir = Dir.EAST;
               break;
           case WEST:
               this.dir = Dir.NORTH;
               break;
       }
    }
    public void turnLeft() {
        switch(this.dir) {
            case WEST:
                this.dir = Dir.SOUTH;
                break;
            case NORTH:
                this.dir = Dir.WEST;
                break;
            case EAST:
                this.dir = Dir.NORTH;
                break;
            case SOUTH:
                this.dir = Dir.EAST;
                break;
        }
    }
}