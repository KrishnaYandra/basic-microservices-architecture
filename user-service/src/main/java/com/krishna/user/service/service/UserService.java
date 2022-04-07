package com.krishna.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.krishna.user.service.entity.Department;
import com.krishna.user.service.entity.User;
import com.krishna.user.service.entity.UserTemplateVO;
import com.krishna.user.service.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public UserTemplateVO getUserWithDepartment(Long id) {
		log.info("Inside getUserWithDepartment of UserService");
		UserTemplateVO userTemplateVO = new UserTemplateVO();
		User user = userRepository.findByUserId(id);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		userTemplateVO.setDepartment(department);
		userTemplateVO.setUser(user);
		return userTemplateVO;
	}
}
