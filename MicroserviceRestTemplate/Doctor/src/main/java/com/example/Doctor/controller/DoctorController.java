package com.example.Doctor.controller;

import com.example.Doctor.entity.Doctor;
import com.example.Doctor.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorRepo doctorRepo;
    @PostMapping("/add")
    public ResponseEntity<Doctor> createdoctor(@RequestBody Doctor doctor){
        return ResponseEntity.ok().body(doctorRepo.save(doctor));
    }
    @GetMapping("/getdocs")
    public ResponseEntity<List<Doctor>> getalldocs(){

        return ResponseEntity.ok().body(doctorRepo.findAll());
    }
    @GetMapping("/getdocbyid/{id}")
    public ResponseEntity<Optional<Doctor>> getdocbyId(@PathVariable Long id){

        Optional<Doctor> docop= doctorRepo.findById(id);
        if(docop.isPresent()) {
            return ResponseEntity.ok().body(doctorRepo.findById(id));
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
