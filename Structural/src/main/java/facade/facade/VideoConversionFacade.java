package facade.facade;

import facade.som_complex_mdeia_Library.*;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("voide convert :start");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = new CodecFactory().extract(file);
        Codec destinationCodec;
        if (format.equals("mp4"))
            destinationCodec = new MP4CompressionCodeC();
        else
            destinationCodec = new MP5CompressionCodeC();

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("Video Convert : complete");
        return result;


    }
}

