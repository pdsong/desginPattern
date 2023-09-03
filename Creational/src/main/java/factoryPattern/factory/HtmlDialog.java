package factoryPattern.factory;

import factoryPattern.buttons.Button;
import factoryPattern.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
