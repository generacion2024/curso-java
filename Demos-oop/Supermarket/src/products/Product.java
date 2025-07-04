package products;

import containers.IContainer;
import enums.Category;

public class Product {

    // Getters

    String getReference();
    int setWeight();
    int getVolume();
    Category getCategory();


    // Logic de negocio

    booLean isCompatible(IProduc p);
    booLean hasSpace(IContainer container);
    void putInto(IProduct)

    
}
