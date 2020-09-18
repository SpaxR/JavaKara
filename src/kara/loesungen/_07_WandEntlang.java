package kara.loesungen;

import kara.KaraStarter;

import java.awt.*;

public class _07_WandEntlang extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _07_WandEntlang();
        starter.runKara("aufgaben/_07_wandentlang/world1.world");
        starter.runKara("aufgaben/_07_wandentlang/world2.world");
        starter.runKara("aufgaben/_07_wandentlang/world3.world");
    }

    @Override
    public void runKara() {
        Point start = kara.getPosition();

        // Find Beginning
        while (!kara.treeRight())
            kara.move();

        while (true) {
            while (kara.treeRight()) {

                while (kara.treeFront()) // may even turn around
                    kara.turnLeft();

                kara.move();
                if (start.equals(kara.getPosition())) return; // Only do one round
            }

            kara.turnRight();
            kara.move();
            if (start.equals(kara.getPosition())) return; // Only do one round
        }
    }
}
