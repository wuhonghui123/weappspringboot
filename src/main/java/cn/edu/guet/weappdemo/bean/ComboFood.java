package cn.edu.guet.weappdemo.bean;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/24/23:49
 */
public class ComboFood {
    public String getComboId() {
        return comboId;
    }

    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public boolean isAdd() {
        return isAdd;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    private String comboId;
    private String foodId;
    private int foodNum;
    private double foodPrice;
    private boolean isAdd;
    private String foodName;
    private String foodImg;
}
