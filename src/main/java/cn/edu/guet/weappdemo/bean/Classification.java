package cn.edu.guet.weappdemo.bean;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/24/23:38
 */
public class Classification {

    private String id;
    private String title;
    private String class_name;
    private String icon;

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}