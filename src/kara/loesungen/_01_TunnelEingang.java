package kara.loesungen;

import kara.KaraStarter;

public class _01_TunnelEingang extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _01_TunnelEingang();
        starter.runKara("aufgaben/_01_tunnel_eingang/world1.world");
        starter.runKara("aufgaben/_01_tunnel_eingang/world2.world");
        starter.runKara("aufgaben/_01_tunnel_eingang/world3.world");
    }


    @Override
    public void runKara() {
        while (!(kara.treeLeft() && kara.treeRight())) {
            kara.move();
        }
    }
}
