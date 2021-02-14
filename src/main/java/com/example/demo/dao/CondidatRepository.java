package com.example.demo.dao;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Condidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CondidatRepository extends JpaRepository<Condidat,Long> {
    @Query("select e from Condidat e where e.login= :login and e.password= :password")
    Condidat login(@Param("login")String login, @Param("password") String password);
}
