package com.exalt.training.builder_pattern.builder;

/**
 * this is the builder interface, each builder will have to implement
 * the interface to be able to instantiate objects with these attributes.
 * The builder interface can be implemented by two builders that produce different objects,
 * for example, we can use the same builder to build Computers and computer manuals.
 * */

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
