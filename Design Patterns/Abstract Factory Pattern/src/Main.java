import GPUs.GpuModel;
import factories.AsusManufacturer;
import factories.Company;
import factories.MsiManufacturer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createAmdGPU(), msi.createNvidiaGPU(), asus.createNvidiaGPU(), asus.createAmdGPU())
                .forEach(GpuModel::assemble);

    }
}