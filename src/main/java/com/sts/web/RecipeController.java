package com.sts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sts.dao.RecipeService;
import com.sts.vo.RecipeVO;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeService rDAO;
	
	@RequestMapping(value="/recipew.do",method = RequestMethod.GET)
	public String recipewrite() {
		return "recipew";
	}
	
	@RequestMapping(value="/recipew.do",method = RequestMethod.POST)
	public String recipewrite(@ModelAttribute("cmd") RecipeVO rvo, 
			MultipartHttpServletRequest request) {
		try {
			MultipartFile file = request.getFile("rimage1");
			rvo.setRimage( file.getBytes() );
			System.out.println(file.getOriginalFilename());

			rDAO.insertRecipeOne(rvo);
			return "redirect:home";
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return "redirect:home";
		}			
	}
	
	@RequestMapping(value="/recipelist.do",method = RequestMethod.GET)
	public String recipelist(Model model) {
		List<RecipeVO> list = rDAO.selectRecipeList();
		model.addAttribute("list", list);
		return "recipe";
	}	
}
