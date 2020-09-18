package kara.loesungen;

import kara.KaraStarter;

public class _08_Slalom extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _08_Slalom();
        starter.loadWorld("aufgaben/_08_slalom/world1.world");
//        starter.loadWorld("aufgaben/_08_slalom/world2.world");
//        starter.loadWorld("aufgaben/_08_slalom/world3.world");
        starter.runKara();
    }

    @Override
    public void runKara() {

    }
}
