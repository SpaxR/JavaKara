package kara.loesungen;

import kara.KaraStarter;

public class _10_Spirale extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _10_Spirale();
        starter.runKara("aufgaben/_10_spirale/world1.world");
    }

    @Override
    public void runKara() {
        for (int length = 1; length <= 20; length++) {
            for (int i = 0; i < length; i++) {
                kara.putLeaf();
                kara.move();
            }
            kara.turnRight();
        }
    }
}

