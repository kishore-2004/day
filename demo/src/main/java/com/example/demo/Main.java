package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Main{

	 @GetMapping("/get")
     public StudentResponse getStudent()
     {
		 StudentResponse studentResponse = new StudentResponse(1,"Ajay","Kanagaraj");
    	 return studentResponse;
     }
	
}
