package kara.loesungen;

import kara.KaraStarter;

public class _02_TunnelAusgang extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _02_TunnelAusgang();
        starter.loadWorld("aufgaben/_02_tunnel_ausgang/world1.world");
//        starter.loadWorld("aufgaben/_02_tunnel_ausgang/world2.world");
//        starter.loadWorld("aufgaben/_02_tunnel_ausgang/world3.world");
        starter.runKara();
    }

    @Override
    public void runKara() {

        // Suche Eingang
        while (!(kara.treeLeft() && kara.treeRight())) {
            kara.move();
        }

        // Suche Ausgang
        while (kara.treeLeft() && kara.treeRight()) {
            kara.move();
        }
    }
}
