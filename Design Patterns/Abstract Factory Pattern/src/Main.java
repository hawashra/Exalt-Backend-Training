import com.exalt.training.designpatterns.factories.AsusManufacturer;
import com.exalt.training.designpatterns.factories.Company;
import com.exalt.training.designpatterns.factories.MsiManufacturer;
import com.exalt.training.designpatterns.GPUs.GpuModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createAmdGPU(), msi.createNvidiaGPU(), asus.createNvidiaGPU(), asus.createAmdGPU())
                .forEach(GpuModel::assemble);

    }
}