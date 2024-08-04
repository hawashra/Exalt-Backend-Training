package com.exalt.training.designpatterns.factories;

import com.exalt.training.designpatterns.GPUs.AmdAsusGPU;
import com.exalt.training.designpatterns.GPUs.GpuModel;
import com.exalt.training.designpatterns.GPUs.NvidiaAsusGPU;

public class AsusManufacturer extends Company {

    @Override
    public GpuModel createAmdGPU() {
        return new AmdAsusGPU();
    }

    @Override
    public GpuModel createNvidiaGPU() {
        return new NvidiaAsusGPU();
    }
}
