package builder.model;

public class Computer {

    private Cooling cooling;

    private MotherBoard motherBoard;

    private CPU cpu;

    private GPU gpu;

    private HDD hdd;

    private RAM ram;

    private PSU psu;

    public Computer(Cooling cooling, MotherBoard motherBoard, CPU cpu, GPU gpu, HDD hdd, RAM ram, PSU psu) {
        this.cooling = cooling;
        this.motherBoard = motherBoard;
        this.cpu = cpu;
        this.gpu = gpu;
        this.hdd = hdd;
        this.ram = ram;
        this.psu = psu;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public PSU getPsu() {
        return psu;
    }

    public void setPsu(PSU psu) {
        this.psu = psu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cooling=" + cooling +
                ", motherBoard=" + motherBoard +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", psu=" + psu +
                '}';
    }
}
