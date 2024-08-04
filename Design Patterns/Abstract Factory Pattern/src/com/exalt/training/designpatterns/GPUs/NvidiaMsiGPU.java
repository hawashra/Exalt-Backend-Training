package com.exalt.training.designpatterns.GPUs;

import com.exalt.training.designpatterns.GPUs.GpuBrand;

public class NvidiaMsiGPU implements GpuBrand {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Nvidia GPU");
    }
}
