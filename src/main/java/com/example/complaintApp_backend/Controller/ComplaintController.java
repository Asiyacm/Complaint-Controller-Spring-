package com.example.complaintApp_backend.Controller;

import com.example.complaintApp_backend.Model.Complaint;
import com.example.complaintApp_backend.dao.ComplaintDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ComplaintController {
    @Autowired
    private ComplaintDao dao;
    @CrossOrigin("*")
    @PostMapping("/")
    public String AdminLogin(){
        return "Admin";
    }
@CrossOrigin("*")
    @PostMapping(path="/register",consumes = "application/json",produces="application/json")
    public HashMap<String, String> UserRegister(@RequestBody Complaint c){
        System.out.println(c.getName().toString());
        dao.save(c);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
}


    @PostMapping("/signin")
    public String UserLogin(){
        return "Login";
    }
}
