package GPUs;

public class NvidiaMsiGPU implements GpuBrand {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Nvidia GPU");
    }
}