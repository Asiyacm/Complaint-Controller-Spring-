package com.example.complaintApp_backend.dao;

import com.example.complaintApp_backend.Model.Complaint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComplaintDao extends CrudRepository<Complaint,Integer> {

@Query(value = "SELECT `id`, `aadharno`, `address`, `cpassword`, `mobile`, `name`, `password`, `username` FROM `compliant` WHERE `username`=:username AND`password`=:password",nativeQuery = true)
List<Complaint>UserLogin(@Param("username") String username, @Param("password") String password);


    @Query(value = "SELECT `id`, `aadharno`, `address`, `cpassword`, `mobile`, `name`, `password`, `username` FROM `compliant` WHERE `username`=:username ",nativeQuery = true)
    List<Complaint> findUser(@Param("username") String username);


}

