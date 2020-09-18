package kara.loesungen;

import kara.KaraStarter;

public class _03_Blaettersuche extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _03_Blaettersuche();
        starter.runKara("aufgaben/_03_blaettersuche_1/world1.world");
        starter.runKara("aufgaben/_03_blaettersuche_1/world2.world");
        starter.runKara("aufgaben/_03_blaettersuche_1/world3.world");
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
        kara.move();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
    }
}
