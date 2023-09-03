package factoryPattern;

import factoryPattern.factory.Dialog;
import factoryPattern.factory.HtmlDialog;
import factoryPattern.factory.WindowsDialog;

public class FactoryTest {
    private static Dialog dialog;
    static  void configure(){
        if(System.getProperty("os.name").equals("Windows 9")){
            dialog=new WindowsDialog();
        }else{
            dialog=new HtmlDialog();
        }
    }
    static void runBusinessLogic(){
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}
