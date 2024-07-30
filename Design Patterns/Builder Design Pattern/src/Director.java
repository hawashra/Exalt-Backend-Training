public class Director {

    public void buildGamingPC(IComputerBuilder builder) {
        builder.setCPU("i7")
                .setGPU("RTX 2060")
                .setSSD("1 TB NVMe")
                .setRAM("DDR5 16 GB")
                .setCooling("RGB NZXT")
                .setMotherboard("Gigabyte Z790 Aorus Xtreme")
                .setHDD("1TB samsung")
                .setPowerSupply("Corsair RM750x");

    }

    public void buildOfficePC(IComputerBuilder builder) {
        builder.setCPU("AMD Ryzen 3 2200G")
                .setGPU("Intel HD 4000")
                .setSSD("256 GB samsung NVMe")
                .setHDD("1TB samsung")
                .setCooling("Basic")
                .setPowerSupply("Cooler Master MasterWatt 550W")
                .setMotherboard("ASRock B450M-HDV R4.0 Micro ATX AM4")
                .setRAM("8 GB samsung DDR3");
    }
}
