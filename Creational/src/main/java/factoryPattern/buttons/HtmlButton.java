package factoryPattern.buttons;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("render a html button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("click html Button ");
    }
}
