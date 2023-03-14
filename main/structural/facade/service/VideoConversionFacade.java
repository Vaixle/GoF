package structural.facade.service;

import structural.facade.model.Codec;
import structural.facade.model.VideoFile;
import structural.facade.model.impl.MPEG4CompressionCodecImpl;
import structural.facade.model.impl.OggCompressionCodecImpl;
import structural.facade.service.AudioMixer;
import structural.facade.service.BitrateReader;
import structural.facade.service.CodecFactory;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodecImpl();
        } else {
            destinationCodec = new OggCompressionCodecImpl();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
