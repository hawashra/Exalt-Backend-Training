package com.exalt.training.designpatterns.GPUs;


/** The model is like Nvidia and AMD/ATI.
    One model can be one of different brands (Asus or MSI in our example).
 */
public interface GpuModel {

    /* this method should be implemented by any GPU that implements the GpuBrand
     interface (which implements this interface)

     this method is called by the factor(y/ies) to assemble GPUs.

     */
    public void assemble();
}
