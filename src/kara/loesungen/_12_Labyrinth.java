package kara.loesungen;

import kara.KaraStarter;

public class _12_Labyrinth extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _12_Labyrinth();
        starter.loadWorld("aufgaben/_12_labyrinthe/world1.world");
//        starter.loadWorld("aufgaben/_12_labyrinthe/world2.world");
//        starter.loadWorld("aufgaben/_12_labyrinthe/world3.world");
        starter.runKara();
    }

    @Override
    public void runKara() {

    }
}

