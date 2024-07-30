package factories;

import GPUs.GpuModel;

public abstract class Company {

    public abstract GpuModel createAmdGPU();
    public abstract GpuModel createNvidiaGPU();
}
