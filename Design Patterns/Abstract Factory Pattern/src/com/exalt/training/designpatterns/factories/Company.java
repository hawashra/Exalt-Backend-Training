package com.exalt.training.designpatterns.factories;

import com.exalt.training.designpatterns.GPUs.GpuModel;

/**
 * This class represents the gpus manufacturing companies.

 * Each manufacturing company works with one or more brand (e.g., Nvidia or AMD/ATI).
 **/

public abstract class Company {

    /* methods to create (manufacture) GPUs, should be implemented by concrete
    manufacturer's */
    public abstract GpuModel createAmdGPU();
    public abstract GpuModel createNvidiaGPU();
}
