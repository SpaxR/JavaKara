package kara.loesungen;

import kara.KaraStarter;

public class _00_KaraUndDieBlaetter extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _00_KaraUndDieBlaetter();
        starter.runKara("aufgaben/_00_kleeblaetter_aufnehmen/world1.world");
        starter.runKara("aufgaben/_00_kleeblaetter_aufnehmen/world2.world");
        starter.runKara("aufgaben/_00_kleeblaetter_aufnehmen/world3.world");
    }


    @Override
    public void runKara() {
        while (!kara.treeFront()) {
            InvertLeaf();
            kara.move();
        }
        InvertLeaf();
    }


    private void InvertLeaf() {
        if (kara.onLeaf())
            kara.removeLeaf();
        else
            kara.putLeaf();
    }


}
        