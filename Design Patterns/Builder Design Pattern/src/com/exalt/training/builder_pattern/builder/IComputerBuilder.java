package com.exalt.training.builder_pattern.builder;

public interface IComputerBuilder {
    IComputerBuilder setCPU (String CPU);
    IComputerBuilder setGPU (String GPU);
    IComputerBuilder setRAM (String RAM);
    IComputerBuilder setSSD (String SSD);
    IComputerBuilder setHDD (String HDD);
    IComputerBuilder setCooling (String Cooling);
    IComputerBuilder setMotherboard (String Motherboard);
    IComputerBuilder setPowerSupply (String PowerSupply);
}
