package com.ohgiraffers.jenkins_test_app.menui.service;

import com.ohgiraffers.jenkins_test_app.menui.entity.MenuEntity;
import com.ohgiraffers.jenkins_test_app.menui.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<MenuEntity> selectAllmenu() {
        List<MenuEntity> menuList = menuRepository.findAll();
        if(menuList.isEmpty()){
            return null;
        }
        return menuList;
    }
}
