package kara.loesungen;

import kara.KaraStarter;

public class _05_Blaettersuche extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _05_Blaettersuche();
        starter.runKara("aufgaben/_05_blaettersuche_3/world1.world");
        starter.runKara("aufgaben/_05_blaettersuche_3/world2.world");
        starter.runKara("aufgaben/_05_blaettersuche_3/world3.world");
    }

    @Override
    public void runKara() {
        while (!kara.onLeaf()) {
            if (kara.treeFront())
                changeDirection();
            else
                kara.move();
        }
    }

    private void changeDirection() {
        if (!kara.treeLeft()) kara.turnLeft();
        if (!kara.treeRight()) kara.turnRight();
    }
}
