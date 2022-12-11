package com.example.complaintApp_backend.Controller;

import com.example.complaintApp_backend.Model.Complaint;
import com.example.complaintApp_backend.dao.ComplaintDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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

    @CrossOrigin("*")
    @PostMapping(path="/signin",consumes = "application/json",produces="application/json")
        public HashMap<String, String> UserLogin(@RequestBody Complaint c){
            List<Complaint> result = (List<Complaint>) dao.UserLogin(c.getUsername(), c.getPassword());
            HashMap<String, String> map = new HashMap<>();
            if(result.size() == 0){
                map.put("status","failed");
            }else{
                map.put("status","success");
                map.put("userId",String.valueOf(result.get(0).getId()));
            }
            return map;
        }
    }

