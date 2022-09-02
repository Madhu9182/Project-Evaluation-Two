package io.capgemini.item.controller;

import io.capgemini.item.exceptions.ProductItemNotFoundException;
import io.capgemini.item.model.ProductItem;
import io.capgemini.item.service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class ProductItemController {

    @Autowired
    private ProductItemService productItemService;

    @PostMapping("/addItem")
    public String saveFoodItem(@RequestBody ProductItem productItem){
        return productItemService.saveFoodItem(productItem);
    }

    @PutMapping("/updateItem/{foodId}")
    public String updateProductItem(@RequestBody ProductItem productItem) throws ProductItemNotFoundException {
        return productItemService.updateProductItem(productItem);
    }

    @GetMapping("/getItem/{foodId}")
    public ProductItem getProductItem(@PathVariable("foodId") Long foodId) throws ProductItemNotFoundException{
        return productItemService.getProductItem(foodId);
    }

    @DeleteMapping("/delete/{foodId}")
    public String deleteProductItem(@PathVariable("foodId") Long foodId) throws ProductItemNotFoundException{
        return productItemService.deleteProductItem(foodId);
    }
}
