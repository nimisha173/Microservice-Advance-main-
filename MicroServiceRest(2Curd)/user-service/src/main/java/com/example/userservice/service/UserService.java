package com.example.userservice.service;

import com.example.userservice.VO.Department;
import com.example.userservice.VO.ResponseTemplateVO;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUser(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        ResponseEntity<Department> departmentResponse = restTemplate.getForEntity(
                "http://Department/departments/get/{departmentId}" + user.getDepartmentId(),
                Department.class
        );
        if (departmentResponse.getStatusCode().is2xxSuccessful()) {
            Department department = departmentResponse.getBody();
            vo.setUser(user);
            vo.setDepartment(department);
        }
        return vo;
    }
}
