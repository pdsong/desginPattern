package facade.som_complex_mdeia_Library;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type=file.getCodecType();
        if(type.equals("mp4")){
            System.out.println("CodecFactory:Extracting mp4");
            return new MP4CompressionCodeC();
        }else{
            System.out.println("CodecFactory:Extracting mp5");
            return new MP5CompressionCodeC();
        }
    }

}
