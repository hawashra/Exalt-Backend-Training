package com.exalt.training.designpatterns.GPUs;

public class AmdMsiGPU implements GpuBrand {


    @Override
    public void assemble() {
        System.out.println("Assembling MSI AMD(ATI) GPU");
    }
}