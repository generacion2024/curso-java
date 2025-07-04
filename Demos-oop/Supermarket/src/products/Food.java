package products;

import enums.Category;

public class Food extends product {

    public food(String referece, int volume, int weight) {
        super(Reference, volume, weight);
    }
    
    @Override
    public Category getCategory() {
        return Category. FOOD;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return Category. FOOD;
    }
       // TODO Auto-generated method stub

       p.getCategory( ) == Category.FOOD
       return false
    
}
