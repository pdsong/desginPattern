package factoryPattern.buttons;

public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("render a windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("click windows button");
    }
}
