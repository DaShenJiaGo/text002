package com.beijing.domain;

/**
 * @Author 小韦
 * @Date 2021/10/6 1:27
 * @Version 1.0
 */
public class YingHang {
    private Integer id;
    private String name;
    private Float money;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public YingHang(Integer id, String name, Float money, Integer age) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public YingHang() {
    }

    @Override
    public String toString() {
        return "LiuXueBao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", age=" + age +
                '}';
    }
}
