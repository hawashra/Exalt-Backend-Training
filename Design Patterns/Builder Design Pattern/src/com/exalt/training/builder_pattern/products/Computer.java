package com.exalt.training.builder_pattern.products;

public class Computer {
    private final String CPU;
    private final String GPU;
    private final String RAM;
    private final String SSD;
    private final String HDD;
    private final String cooling;
    private final String motherboard;
    private final String powerSupply;

    public Computer (String CPU, String GPU, String RAM, String SSD, String HDD, String cooling, String motherboard, String powerSupply) {

        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.HDD = HDD;
        this.cooling = cooling;
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", SSD='" + SSD + '\'' +
                ", HDD='" + HDD + '\'' +
                ", cooling='" + cooling + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }
}
