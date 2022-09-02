package io.capgemini.item.service;

import io.capgemini.item.exceptions.ProductItemNotFoundException;
import io.capgemini.item.model.ProductItem;

public interface ProductItemService {
    String saveFoodItem(ProductItem productItem);

    String updateProductItem(ProductItem productItem) throws ProductItemNotFoundException;

    ProductItem getProductItem(Long foodId) throws ProductItemNotFoundException;

    String deleteProductItem(Long foodId) throws ProductItemNotFoundException;
}
