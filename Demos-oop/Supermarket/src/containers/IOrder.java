package containers;
import java.util.Set;


import containers.IContainer;
import products.IProduct;
import products.IProducts;

public interface IOrder {

    // Getters


    String getReference();
    Seet<IContainer> getContainrs();

    Set<IProduct> getCalculateProducts();

    // Logica de negocio

    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);

}
