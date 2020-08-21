package com.hanz.mbs.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FtlTest {

	@RequestMapping("/home")
	public String index(Model model){
		model.addAttribute("welcome","hello fishpro");
		return "home";
	}

	@RequestMapping("/level1/index")
	public String level1index(Model model){
		model.addAttribute("welcome","hello fishpro");
		return "level1/index";
	}

	@RequestMapping("/level2/index")
	public String level2index(Model model){
		model.addAttribute("welcome","hello fishpro");
		return "level2/index";
	}
}