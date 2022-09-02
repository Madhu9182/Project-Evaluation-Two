package io.capgemini.item.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
    private String foodName;
    private int foodCost;
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodCost() {
		return foodCost;
	}
	public void setFoodCost(int foodCost) {
		this.foodCost = foodCost;
	}
	public ProductItem(Long foodId, String foodName, int foodCost) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodCost = foodCost;
	}
	public ProductItem() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
