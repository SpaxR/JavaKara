package kara.loesungen;

import kara.KaraStarter;

public class _11_Dreiecke extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _11_Dreiecke();
        starter.runKara("aufgaben/_11_dreiecke/world1.world");
    }

    @Override
    public void runKara() {
        boolean isGoingRight = true;

        // Height of Triangle
        for (int line = 1; line <= 20; line += 2) {

            // place Line
            for (int i = 0; i < line; i++) {
                kara.putLeaf();
                kara.move();
            }

            // goto next line
            if (isGoingRight) {
                kara.turnRight();
                kara.move();
                kara.turnRight();
            } else {
                kara.turnLeft();
                kara.move();
                kara.turnLeft();
            }
            isGoingRight = !isGoingRight;
        }


    }
}

