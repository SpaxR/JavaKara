package kara.loesungen;

import kara.KaraStarter;

public class _07_WandEntlang extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _07_WandEntlang();
        starter.runKara("aufgaben/_07_wandentlang/world1.world");
        starter.runKara("aufgaben/_07_wandentlang/world2.world");
        starter.runKara("aufgaben/_07_wandentlang/world3.world");
    }

    @Override
    public void runKara() {
        kara.putLeaf(); // Set starting point

        while (!kara.treeRight())
            kara.move();

        while (!kara.onLeaf()) {
            while (kara.treeRight()) {
                while (kara.treeFront()) // may even turn around
                    kara.turnLeft();

                // Stop if round completed
                if (!kara.onLeaf()) kara.move();
            }

            // Stop if round completed
            if (!kara.onLeaf()) {
                kara.turnRight();
                kara.move();
            }
        }

        // Remove starting Point
        kara.removeLeaf();

    }
}
