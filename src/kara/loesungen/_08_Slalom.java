package kara.loesungen;

import kara.KaraStarter;

public class _08_Slalom extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _08_Slalom();
        starter.runKara("aufgaben/_08_slalom/world1.world");
        starter.runKara("aufgaben/_08_slalom/world2.world");
        starter.runKara("aufgaben/_08_slalom/world3.world");
    }

    @Override
    public void runKara() {
        // Set starting point
        kara.putLeaf();

        boolean isRightTurn = false;

        do {
            if (isRightTurn)
                TurnRight();
            else
                TurnLeft();

            // Only change diretion if not at an end
            if (kara.treeLeft() && kara.treeRight())
                isRightTurn = !isRightTurn;

        } while (!kara.onLeaf());

        // Remove starting point
        kara.removeLeaf();
    }

    private void TurnLeft() {
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
        kara.turnLeft();
        kara.move();
    }

    private void TurnRight() {
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
        kara.turnRight();
        kara.move();
    }

}
