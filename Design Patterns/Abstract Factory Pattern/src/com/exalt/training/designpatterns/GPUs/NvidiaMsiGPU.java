package com.exalt.training.designpatterns.GPUs;


public class NvidiaMsiGPU implements GpuBrand {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Nvidia GPU");
    }
}
