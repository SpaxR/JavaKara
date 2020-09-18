package kara.loesungen;

import kara.KaraStarter;

public class _09_BilderInvertieren extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _09_BilderInvertieren();
        starter.runKara("aufgaben/_09_bilder_invertieren/world1.world");
        starter.runKara("aufgaben/_09_bilder_invertieren/world2.world");
        starter.runKara("aufgaben/_09_bilder_invertieren/world3.world");
    }

    @Override
    public void runKara() {
        boolean isRunningRight = true;

        do {
            // Invert Row
            invertLeaf();
            while (!kara.treeFront()) {
                kara.move();
                invertLeaf();
            }

            // Go down if possible
            if (canGoDown(isRunningRight)) {
                goDown(isRunningRight);
                isRunningRight = !isRunningRight;
            }
        } while (!kara.treeFront());

    }


    private void invertLeaf() {
        if (kara.onLeaf())
            kara.removeLeaf();
        else
            kara.putLeaf();
    }

    private boolean canGoDown(boolean isRunningRight) {
        if (isRunningRight)
            return !kara.treeRight();
        else
            return !kara.treeLeft();
    }

    private void goDown(boolean isRightTurn) {
        if (isRightTurn) {
            kara.turnRight();
            kara.move();
            kara.turnRight();
        } else {
            kara.turnLeft();
            kara.move();
            kara.turnLeft();
        }

    }
}

