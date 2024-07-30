package factories;

import GPUs.AmdAsusGPU;
import GPUs.GpuModel;
import GPUs.NvidiaAsusGPU;

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
