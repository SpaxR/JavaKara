package kara.loesungen;

import kara.KaraStarter;

public class _16_Mandelbrot extends KaraStarter {

    public static void main(String[] args) throws Exception {
        KaraStarter starter = new _16_Mandelbrot();
        starter.loadWorld("aufgaben/_16_mandelbrot/world1.world");
//        starter.loadWorld("aufgaben/_16_mandelbrot/world2.world");
//        starter.loadWorld("aufgaben/_16_mandelbrot/world3.world");
        starter.runKara();
    }

    @Override
    public void runKara() {

    }
}

