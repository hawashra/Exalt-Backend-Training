package com.exalt.training.designpatterns.GPUs;

import com.exalt.training.designpatterns.GPUs.GpuBrand;

public class NvidiaAsusGPU implements GpuBrand {

    @Override
    public void assemble() {
        System.out.println("Assembling Asus Nvidia GPU");
    }
}
