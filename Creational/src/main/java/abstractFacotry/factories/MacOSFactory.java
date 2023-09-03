package abstractFacotry.factories;

import abstractFacotry.button.Button;
import abstractFacotry.button.MacOSButton;
import abstractFacotry.checkBox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSCheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
