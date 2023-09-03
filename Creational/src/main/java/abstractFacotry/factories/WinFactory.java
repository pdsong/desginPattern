package abstractFacotry.factories;

import abstractFacotry.button.Button;
import abstractFacotry.button.WinButton;
import abstractFacotry.checkBox.Checkbox;
import abstractFacotry.checkBox.WinCheckBox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckBox();
    }
}
