package com.example.complaintApp_backend.dao;

import com.example.complaintApp_backend.Model.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintDao extends CrudRepository<Complaint,Integer> {


}
