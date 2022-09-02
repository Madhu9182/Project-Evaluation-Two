package io.capgemini.item.service;

import io.capgemini.item.exceptions.ProductItemNotFoundException;
import io.capgemini.item.model.ProductItem;
import io.capgemini.item.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductItemServiceImpl implements ProductItemService {

    @Autowired
    private ProductItemRepository productItemRepository;

    @Override
    public String saveFoodItem(ProductItem productItem) {
        productItemRepository.save(productItem);
        return "Product has been saved successfully";
    }

    @Override
    public String updateProductItem(ProductItem productItem) throws ProductItemNotFoundException {
        ProductItem product = productItemRepository.findById(productItem.getFoodId()).orElseThrow(()-> new ProductItemNotFoundException());
        product.setFoodName(productItem.getFoodName());
        product.setFoodCost(productItem.getFoodCost());
        productItemRepository.save(productItem);
        return "Successfully Updated ProductFoodItem";
    }

    @Override
    public ProductItem getProductItem(Long foodId) throws ProductItemNotFoundException {
        ProductItem productItem = productItemRepository.findById(foodId).orElseThrow(()-> new ProductItemNotFoundException());
        return productItem;
    }

    @Override
    public String deleteProductItem(Long foodId) throws ProductItemNotFoundException {
        ProductItem product = productItemRepository.findById(foodId).orElseThrow(()-> new ProductItemNotFoundException());
        productItemRepository.delete(product);
        return "Deleted successfully";
    }
}
