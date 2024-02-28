package com.example.ImageDetector.Controller;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ImageDetector.Client.Client;

@Controller
public class MainController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("clientform", new Client());
		return "index";
	}

	@PostMapping("/addClient")
	public String addClient(@ModelAttribute Client client, Model model) {
		System.out.println(client.toString());
		model.addAttribute("clientform", new Client());
		model.addAttribute("message", "Add Successfully");
		return "index";
	}

}
