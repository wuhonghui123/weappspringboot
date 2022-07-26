package cn.edu.guet.weappdemo.bean;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/24/23:49
 */
public class Combo {
    private String id;
    private String name;
    private double price;
    private int sale;
    private int likeNum;
    private List<Integer> classificationIds;
    private int publishStatus;
    private List<ComboFood> comboDish;
    private List<String> tags;
    private List<String> imgs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public List<Integer> getClassificationIds() {
        return classificationIds;
    }

    public void setClassificationIds(List<Integer> classificationIds) {
        this.classificationIds = classificationIds;
    }

    public int getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(int publishStatus) {
        this.publishStatus = publishStatus;
    }

    public List<ComboFood> getComboDish() {
        return comboDish;
    }

    public void setComboDish(List<ComboFood> comboDish) {
        this.comboDish = comboDish;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }


}
