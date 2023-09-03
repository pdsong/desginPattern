package abstractFacotry;

import abstractFacotry.factories.GUIFactory;
import abstractFacotry.factories.MacOSFactory;
import abstractFacotry.factories.WinFactory;

public class AbstractFactoryTest {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WinFactory();
            app = new Application(factory);
        } else {
            factory = new MacOSFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app=configureApplication();
        app.paint();
    }
}
