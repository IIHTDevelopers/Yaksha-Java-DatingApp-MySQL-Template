package com.iiht.training.datingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.datingapp.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

}
