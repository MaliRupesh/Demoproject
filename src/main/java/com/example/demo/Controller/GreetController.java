package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	   @GetMapping
		public String GreetController() {
		   String msg="Welcome to hell";
			return msg;
			
		}
}
