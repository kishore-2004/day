package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MessageController {
    @GetMapping("check")
    public String CheckApi() throws JsonProcessingException
    {
    	ApiResponse response=new ApiResponse("Hi and How are you");
    	ObjectMapper obj=new ObjectMapper();
    	return obj.writeValueAsString(response);
    }
    
}
