package com.exalt.training.designpatterns.factories;


import com.exalt.training.designpatterns.GPUs.AmdMsiGPU;
import com.exalt.training.designpatterns.GPUs.GpuModel;
import com.exalt.training.designpatterns.GPUs.NvidiaMsiGPU;

public class MsiManufacturer extends Company {

    @Override
    public GpuModel createAmdGPU() {
        return new AmdMsiGPU();
    }

    @Override
    public GpuModel createNvidiaGPU() {
        return new NvidiaMsiGPU();
    }
}
