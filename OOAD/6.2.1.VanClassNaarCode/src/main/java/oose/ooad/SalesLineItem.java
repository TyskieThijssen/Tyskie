package oose.ooad;

/**
 * Created by tyskie on 2/22/17.
 */
public class SalesLineItem {
    private ProductSpecification productSpecification;
    private int quantity;

    public SalesLineItem(ProductSpecification spec, int qty){
        productSpecification = spec;
        quantity = qty;
    }

}
