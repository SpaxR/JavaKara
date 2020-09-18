package kara;

import ch.karatojava.kapps.Application;
import ch.karatojava.kapps.world.World;
import javakara.JavaKaraProgram;

import java.io.File;


public abstract class KaraStarter extends JavaKaraProgram {


    private final Application _app;

    public KaraStarter() {
        this._app = this.createApplication();
        this._app.startApplication(new String[0]);
//        this.init();
    }

    public void loadWorld(String file) throws Exception {
        // Lade Datei
        this._app.getWorldEditorFacade().getWorldEditor().load(new File(file));
        // Lade Welt
        this.setWorld((World) this._app.getWorldEditorFacade().getWorldEditor().getContent());
    }

    public void runKara(String world) throws Exception {
        loadWorld(world);
        runKara();
    }

    public abstract void runKara();


    public void stop() {
        this._app.stopApplication();
    }
}
