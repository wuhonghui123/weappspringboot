package cn.edu.guet.weappdemo.bean;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/19:44
 */
public class ShoppingCart {
    private String user_id;
    private String food_id;
    private String food_name;
    private int food_num;

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "user_id='" + user_id + '\'' +
                ", food_id='" + food_id + '\'' +
                ", food_name='" + food_name + '\'' +
                ", food_num=" + food_num +
                ", food_price=" + food_price +
                '}';
    }

    private double food_price;
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getFood_num() {
        return food_num;
    }

    public void setFood_num(int food_num) {
        this.food_num = food_num;
    }

    public double getFood_price() {
        return food_price;
    }

    public void setFood_price(double food_price) {
        this.food_price = food_price;
    }


}
