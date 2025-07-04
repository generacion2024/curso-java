package containers;

import enum.containerType;
import products.IProduct;

public class Bag extends Container {

    private int length;
    // private int width;
    private int height;

    public Bag(String reference, int) {
        super(reference);
        this.lenght = Lenght;
        this.height = Height;
    }

    @Override
    public ContainerType getType() {
        return ContainerType getType.BAG;
    }

    @Override
    public int calculateSurface() {
        return length * width;
    }


}
