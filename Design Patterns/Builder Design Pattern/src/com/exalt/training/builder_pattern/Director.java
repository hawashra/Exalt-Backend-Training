package com.exalt.training.builder_pattern;

import com.exalt.training.builder_pattern.builder.IComputerBuilder;

/**
 * the director class is used to help utilize the builder class by making ready to use methods
 * to create popular types of the product (Computer in our example).
 * */

public class Director {


    /* the methods here give values to the attributes of the builder to
        be able to use builder.build() method to create objects with such values, useufl for
        code reusability
     */

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
