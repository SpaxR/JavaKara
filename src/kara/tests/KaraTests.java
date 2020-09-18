package kara.tests;

import kara.KaraStarter;
import kara.loesungen.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class KaraTests extends KaraTest {

    KaraStarter starter;

    @AfterEach
    public void ExitApplication() {
        if (starter != null) {
            starter.stop();
        }
    }

    @Test
    public void KaraUndDieBlaetter() throws Exception {
        starter = new _00_KaraUndDieBlaetter();

        RunTest(starter, "aufgaben/_00_kleeblaetter_aufnehmen/world1");
        RunTest(starter, "aufgaben/_00_kleeblaetter_aufnehmen/world2");
        RunTest(starter, "aufgaben/_00_kleeblaetter_aufnehmen/world3");
    }

    @Test
    public void TunnelEingang() throws Exception {
        starter = new _01_TunnelEingang();

        RunTest(starter, "aufgaben/_01_tunnel_eingang/world1");
        RunTest(starter, "aufgaben/_01_tunnel_eingang/world2");
        RunTest(starter, "aufgaben/_01_tunnel_eingang/world3");
    }

    @Test
    public void TunnelAusgang() throws Exception {
        starter = new _02_TunnelAusgang();

        RunTest(starter, "aufgaben/_02_tunnel_ausgang/world1");
        RunTest(starter, "aufgaben/_02_tunnel_ausgang/world2");
        RunTest(starter, "aufgaben/_02_tunnel_ausgang/world3");
    }

    @Test
    public void BlaetterSuche1() throws Exception {
        starter = new _03_Blaettersuche();

        RunTest(starter, "aufgaben/_03_blaettersuche_1/world1");
        RunTest(starter, "aufgaben/_03_blaettersuche_1/world2");
        RunTest(starter, "aufgaben/_03_blaettersuche_1/world3");
    }

    @Test
    public void BlaetterSuche2() throws Exception {
        starter = new _04_Blaettersuche();

        RunTest(starter, "aufgaben/_04_blaettersuche_2/world1");
        RunTest(starter, "aufgaben/_04_blaettersuche_2/world2");
        RunTest(starter, "aufgaben/_04_blaettersuche_2/world3");
    }

    @Test
    public void BlaetterSuche3() throws Exception {
        starter = new _05_Blaettersuche();

        RunTest(starter, "aufgaben/_05_blaettersuche_3/world1");
        RunTest(starter, "aufgaben/_05_blaettersuche_3/world2");
        RunTest(starter, "aufgaben/_05_blaettersuche_3/world3");
    }


    @Test
    public void Pacman() throws Exception {
        starter = new _06_Pacman();

        RunTest(starter, "aufgaben/_06_pacman/world1");
        RunTest(starter, "aufgaben/_06_pacman/world2");
    }

    @Test
    public void WandEntlang() throws Exception {
        starter = new _07_WandEntlang();

        RunTest(starter, "aufgaben/_07_wandentlang/world1");
        RunTest(starter, "aufgaben/_07_wandentlang/world2");
        RunTest(starter, "aufgaben/_07_wandentlang/world3");
    }

    @Test
    public void Slalom() throws Exception {
        starter = new _08_Slalom();

        RunTest(starter, "aufgaben/_08_slalom/world1");
        RunTest(starter, "aufgaben/_08_slalom/world2");
        RunTest(starter, "aufgaben/_08_slalom/world3");
    }

    @Test
    public void BilderInvertieren() throws Exception {
        starter = new _09_BilderInvertieren();

        RunTest(starter, "aufgaben/_09_bilder_invertieren/world1");
        RunTest(starter, "aufgaben/_09_bilder_invertieren/world2");
        RunTest(starter, "aufgaben/_09_bilder_invertieren/world3");
    }

    @Test
    public void Spirale() throws Exception {
        starter = new _10_Spirale();

        RunTest(starter, "aufgaben/_10_spirale/world1");
    }

    @Test
    public void Dreiecke() throws Exception {
        starter = new _11_Dreiecke();

        RunTest(starter, "aufgaben/_11_dreiecke/world1");
    }

    @Test
    public void Labyrinth() throws Exception {
        starter = new _12_Labyrinth();

        RunTest(starter, "aufgaben/_12_labyrinthe/world1");
        RunTest(starter, "aufgaben/_12_labyrinthe/world2");
        RunTest(starter, "aufgaben/_12_labyrinthe/world3");
    }

    @Test
    public void GameOfLife() throws Exception {
        starter = new _13_GameOfLife();

        RunTest(starter, "aufgaben/_13_gameoflife/world1");
        RunTest(starter, "aufgaben/_13_gameoflife/world2");
        RunTest(starter, "aufgaben/_13_gameoflife/world3");
    }

    @Test
    public void Lindenmayer() throws Exception {
        starter = new _14_Lindenmayer();

        RunTest(starter, "aufgaben/_14_lindenmayer/world1");
    }

    @Test
    public void BubbleSort() throws Exception {
        starter = new _15_BubbleSort();

        RunTest(starter, "aufgaben/_15_bubblesort/world1");
        RunTest(starter, "aufgaben/_15_bubblesort/world2");
        RunTest(starter, "aufgaben/_15_bubblesort/world3");
    }

    @Test
    public void Mandelbrot() throws Exception {
        starter = new _16_Mandelbrot();

        RunTest(starter, "aufgaben/_16_mandelbrot/world1");
    }


}