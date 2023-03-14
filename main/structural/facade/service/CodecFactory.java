package structural.facade.service;

import structural.facade.model.Codec;
import structural.facade.model.VideoFile;
import structural.facade.model.impl.MPEG4CompressionCodecImpl;
import structural.facade.model.impl.OggCompressionCodecImpl;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodecImpl();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodecImpl();
        }
    }
}
