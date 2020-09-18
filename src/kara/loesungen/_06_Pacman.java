package kara.loesungen;

import kara.KaraStarter;

public class _06_Pacman extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _06_Pacman();
        starter.loadWorld("aufgaben/_06_pacman/world1.world");
//        starter.loadWorld("aufgaben/_06_pacman/world2.world");
        starter.runKara();
    }

    @Override
    public void runKara() {

    }
}
