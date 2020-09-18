package kara.loesungen;

import kara.KaraStarter;

public class _12_Labyrinth extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _12_Labyrinth();
//        starter.runKara("aufgaben/_12_labyrinthe/world1.world");
//        starter.runKara("aufgaben/_12_labyrinthe/world2.world");
        starter.runKara("aufgaben/_12_labyrinthe/world3.world");
    }

    @Override
    public void runKara() {

        boolean isExitLeft = true;

        // Until exit
        while (!kara.onLeaf()) {

            // move forward
            if (!kara.treeFront()) {
                kara.move();
            }
            // turn around
            else {
                kara.turnLeft();
                kara.turnLeft();
                isExitLeft = false;
            }

            // Look for exit
            if (isExitLeft && !kara.treeLeft()) {
                kara.turnLeft();
                kara.move();
                kara.move();
                kara.turnRight();
            }
            if (!isExitLeft && !kara.treeRight()) {
                kara.turnRight();
                kara.move();
                kara.move();
                kara.turnRight();
                isExitLeft = true;
            }


        }
    }

}

