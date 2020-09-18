package kara.loesungen;

import kara.KaraStarter;

public class _11_Dreiecke extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _11_Dreiecke();
        starter.runKara("aufgaben/_11_dreiecke/world1.world");
    }

    private int calculatePossibleLines() {
        // Maximal width/2, or height if world is smaller
        return Math.min((this.world.getSizeX()) / 2, this.world.getSizeY());
    }

    private void setKaraToPosition() {
        kara.setPosition(this.world.getSizeX() / 2, 0);
    }

    @Override
    public void runKara() {
        boolean isGoingRight = true;
        int lines = calculatePossibleLines();

        setKaraToPosition();

        // Height of Triangle
        for (int line = 1; line <= lines; line++) {

            // place Line
            for (int i = 0; i < line * 2 - 1; i++) {
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

