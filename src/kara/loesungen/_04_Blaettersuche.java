package kara.loesungen;

import kara.KaraStarter;

public class _04_Blaettersuche extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _04_Blaettersuche();
        starter.runKara("aufgaben/_04_blaettersuche_2/world1.world");
        starter.runKara("aufgaben/_04_blaettersuche_2/world2.world");
        starter.runKara("aufgaben/_04_blaettersuche_2/world3.world");
    }

    @Override
    public void runKara() {
        while (!kara.onLeaf()) {
            if (kara.treeFront())
                goAround();
            else
                kara.move();
        }
    }

    private void goAround() {
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        while (kara.treeRight())
            kara.move();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
    }
}
