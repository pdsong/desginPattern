package factoryPattern.factory;

import factoryPattern.buttons.Button;
import factoryPattern.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
