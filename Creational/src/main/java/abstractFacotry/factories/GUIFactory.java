package abstractFacotry.factories;

import abstractFacotry.button.Button;
import abstractFacotry.checkBox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
