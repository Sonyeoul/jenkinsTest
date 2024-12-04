package com.ohgiraffers.jenkins_test_app.menui.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_menu")
public class MenuEntity {

    @Id
    @Column(name = "menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuCode;

    @Column(name="menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int categoryCode;

    @Column(name = "orderable_status")
    private String orderableStatus;

    public MenuEntity() {
    }

    public MenuEntity(Integer menuCode, String menuName, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(Integer menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
