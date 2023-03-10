package builder.impl;

import builder.model.*;

public class ComputerBuilder implements Builder {

    private Cooling cooling;

    private MotherBoard motherBoard;

    private CPU cpu;

    private GPU gpu;

    private HDD hdd;

    private RAM ram;

    private PSU psu;

    @Override
    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public void setHDD(HDD hdd) {
        this.hdd = hdd;
    }

    @Override
    public void setPSU(PSU psu) {
        this.psu = psu;
    }

    @Override
    public void setGPU(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    public Computer build(){
        return new Computer(cooling, motherBoard, cpu, gpu, hdd, ram, psu);
    }
}
