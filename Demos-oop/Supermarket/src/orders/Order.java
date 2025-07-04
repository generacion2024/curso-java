package orders;

import containers.IContainer;
import products.IProduct;

public class Order implenet IOrder {

    private String reference;
    private Set<IContainer> containers;
    private Set<IProduct> products;

    @Override
     public Set<IContainer> getContainrs() {
        return containrs;
    }

    @Override
    public set<IProduct> getProducts() {
        return products;
    }

    @Override
    public void addContainer(IContainer container) {
        containers.add(container);

    }
    
    @Override
    public IContainer addProduct(IProduct product) {
         // TODO   Añadir al container

         for (IContainer container : containers) {
            if (container.canInsert(product))
            return container;
         }
         return null;
    }

    @Override
    public String toString() {
        String messagr = """
                Referencia: %s
                Hash: %s
                """.formatted(
                super.toString()
                );
    }




}
