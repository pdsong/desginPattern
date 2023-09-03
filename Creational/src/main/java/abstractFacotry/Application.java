package abstractFacotry;

import abstractFacotry.button.Button;
import abstractFacotry.checkBox.Checkbox;
import abstractFacotry.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button=factory.createButton();
        checkbox=factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
