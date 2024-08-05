package com.exalt.training.designpatterns.GPUs;

public class AmdAsusGPU implements GpuBrand {

    @Override
    public void assemble() {
        System.out.println("Assembling Asus AMD(ATI) GPU");
    }
}
