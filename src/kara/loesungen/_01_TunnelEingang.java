package kara.loesungen;

import kara.KaraStarter;

public class _01_TunnelEingang extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _01_TunnelEingang();
//        starter.loadWorld("aufgaben/_01_tunnel_eingang/world1.world");
//        starter.loadWorld("aufgaben/_01_tunnel_eingang/world2.world");
        starter.loadWorld("aufgaben/_01_tunnel_eingang/world3.world");
        starter.runKara();
    }


    @Override
    public void runKara() {
        while (!(kara.treeLeft() && kara.treeRight())) {
            kara.move();
        }
    }
}
