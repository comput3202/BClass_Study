package org.zerock.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.web.vo.Product;

@Controller
public class SampleController4 {
	
    private static final Logger logger = LoggerFactory.getLogger(SampleController4.class); 
	
	@RequestMapping("doE")
	public String doE( RedirectAttributes rttr ) {
		logger.info("doE Call.............");
		
		rttr.addFlashAttribute("msg", "redirect data.....");
		return "redirect:/doF";
	}
	@RequestMapping("doF")
	public void doF( @ModelAttribute String msg ) {
		logger.info("doF Call............." + msg );
	}
}
