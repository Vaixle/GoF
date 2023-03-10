package creational.builder.impl;

import creational.builder.model.*;

public class Director {

    public void buildGameComputer(Builder builder) {
        builder.setCooling(new Cooling(6));
        builder.setCPU(new CPU(4));
        builder.setHDD(new HDD(1000));
        builder.setRAM(new RAM(32));
        builder.setMotherBoard(new MotherBoard("ASUS ROG Maximus XIII Hero Z590"));
        builder.setGPU(new GPU("NVIDIA GeForce RTX 3070"));
        builder.setPSU(new PSU(750));
    }
}
