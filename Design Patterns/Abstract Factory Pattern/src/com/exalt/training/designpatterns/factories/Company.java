package com.exalt.training.designpatterns.factories;

import com.exalt.training.designpatterns.GPUs.GpuModel;

public abstract class Company {

    public abstract GpuModel createAmdGPU();
    public abstract GpuModel createNvidiaGPU();
}
