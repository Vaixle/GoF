package creational.builder.impl;

import creational.builder.model.*;

public interface Builder {

    void setCooling(Cooling cooling);

    void setCPU(CPU cpu);

    void setMotherBoard(MotherBoard motherBoard);

    void setHDD(HDD hdd);

    void setPSU(PSU psu);

    void setGPU(GPU gpu);

    void setRAM(RAM ram);
}
