package kara.loesungen;

import kara.KaraStarter;

public class _06_Pacman extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _06_Pacman();
        starter.runKara("aufgaben/_06_pacman/world1.world");
        starter.runKara("aufgaben/_06_pacman/world2.world");
    }

    @Override
    public void runKara() {
        while (!(kara.treeFront() && kara.onLeaf())) {

            if (kara.onLeaf()) {
                kara.removeLeaf();
                kara.move();
            } else {
                findNextLeaf();
            }
        }

        // Take last Leaf
        kara.removeLeaf();
    }

    private void findNextLeaf() {
        // Turn Around
        kara.turnLeft();
        kara.turnLeft();
        kara.move();

        // Look LeftSide
        kara.turnRight();
        kara.move();

        if (!kara.onLeaf()) {
            // Look Right Side
            kara.turnLeft();
            kara.turnLeft();
            kara.move();
            kara.move();
        }


    }

}
