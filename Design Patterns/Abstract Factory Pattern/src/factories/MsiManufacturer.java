package factories;

import GPUs.AmdMsiGPU;
import GPUs.GpuModel;
import GPUs.NvidiaMsiGPU;

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
