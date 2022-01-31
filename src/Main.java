public class Main {


    public static void main(String[] args) {
/*
Make a Tank(add code to class Tank),
which can move forward and backward
*/
        // At (0;0) fuel=100
        Tank justTank = new Tank();
// At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
// At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
/*
This fragment of code has to output

The Tank is at 10 now.
The Tank is at 60 now.
The Tank is at -40 now.

*/
    }

}

