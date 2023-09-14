package facade.som_complex_mdeia_Library;

import facade.facade.VideoConversionFacade;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        VideoConversionFacade converter=new VideoConversionFacade();
        File mp4Video=converter.convertVideo("hahaha.mp5","mp4");
    }

}
