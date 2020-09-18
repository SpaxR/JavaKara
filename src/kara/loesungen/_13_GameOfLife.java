package kara.loesungen;

import kara.KaraStarter;

public class _13_GameOfLife extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _13_GameOfLife();
        starter.loadWorld("aufgaben/_13_gameoflife/world1.world");
//        starter.loadWorld("aufgaben/_13_gameoflife/world2.world");
//        starter.loadWorld("aufgaben/_13_gameoflife/world3.world");
        starter.runKara();
    }

    @Override
    public void runKara() {

    }
}

