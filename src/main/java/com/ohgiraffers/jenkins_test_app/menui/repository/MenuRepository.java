package com.ohgiraffers.jenkins_test_app.menui.repository;


import com.ohgiraffers.jenkins_test_app.menui.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity,Integer> {

}
