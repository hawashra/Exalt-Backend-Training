public class ComputerBuilder implements IComputerBuilder {
    private String CPU;
    private String GPU;
    private String RAM;
    private String SSD;
    private String HDD;
    private String cooling;
    private String motherboard;
    private String powerSupply;

    public ComputerBuilder() {}

    @Override
    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    @Override
    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public ComputerBuilder setSSD(String SSD) {
        this.SSD = SSD;
        return this;
    }

    @Override
    public ComputerBuilder setHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    @Override
    public ComputerBuilder setCooling(String cooling) {
        this.cooling = cooling;
        return this;
    }

    @Override
    public ComputerBuilder setMotherboard(String motherboard) {

        this.motherboard = motherboard;
        return this;
    }

    @Override
    public ComputerBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public Computer build() {
       return new Computer(CPU, GPU,
                RAM, SSD, HDD, cooling, motherboard, powerSupply);

    }
}
