package containers;

import java.util.set;

import enums.ContainerType;
import products.IProduct;

public abstract class  Container implements IContainer{

    private String reference;
    private ContainerType tContainerType;
    private int resistance;
    // private int resistance;
    // private int resistance;
    // private int resistance;
    private set<IProduct> products();

    public Containe(String references) {
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public ContainerType getType() {
        return type;
    }

    @Override
    public int getResistence() {
        return resistence;
    }

    @Override
    public int volumeDisponible() {
        int totalVolumen = calculateVolume();
        int usedVolume = = 0;

        for (IProduc product : products) {
            usedVolume += product.getVolume()
        }
        return totalvolume - usedVolume;
    }

    @Override
    public boolean canInsert(IDproduc product) {
        // es resistente
        if(!this.isResistenTo(product))
        return true;
    }
    // tiene espacio
     if(!this.isResistenTo(product)) ´{
        return true;
     }
        // los productos son compatibles
    for (IProduct elemnt : products) {
        if(!product )
    }
}
