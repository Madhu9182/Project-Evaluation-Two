package io.capgemini.item.exceptions;

public class ProductItemNotFoundException extends Exception{
    public ProductItemNotFoundException() {
        super("Product Item Not Found");
    }

}
