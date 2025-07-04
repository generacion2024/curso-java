package containers;
import java.util.Set;

import enums.ContainerType;
import products.IProduct;

public class IContainer {

    // Getters

    String getReference();
    int getVolume();
    int getSurface();
    int getResistence();
    ContainerType getType();
    Set<IProduct> getProducts();

    // Logica de negocios
    int volumenDisposable();

    boolean canInsert(IProduct)

}
