package kara.tests;

import javakara.JavaKaraProgram;
import kara.KaraStarter;
import org.junit.jupiter.api.Assertions;

public abstract class KaraTest {


    protected void RunTest(KaraStarter starter, String world) throws Exception {

        starter.loadWorld(world + ".world");
        JavaKaraProgram.JavaKaraWorld reality = starter.world;

        starter.runKara();

        starter.loadWorld(world + "_solved.world");
        JavaKaraProgram.JavaKaraWorld expectation = starter.world;
        CompareWorlds(reality, expectation);
    }


    protected void CompareWorlds(JavaKaraProgram.JavaKaraWorld reality, JavaKaraProgram.JavaKaraWorld expectation) {

        Assertions.assertEquals(expectation.getSizeX(), reality.getSizeX());
        Assertions.assertEquals(expectation.getSizeY(), reality.getSizeY());

        for (int y = 0; y < expectation.getSizeY(); y++)
            for (int x = 0; x < expectation.getSizeX(); x++) {
                Assertions.assertEquals(expectation.isEmpty(x, y), reality.isEmpty(x, y));
            }
    }


}
