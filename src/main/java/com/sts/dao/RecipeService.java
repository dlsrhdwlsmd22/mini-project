package com.sts.dao;

import java.util.List;

import com.sts.vo.RecipeVO;

public interface RecipeService {
	
	public int insertRecipeOne(RecipeVO rvo);
	
	public List<RecipeVO> selectRecipeList(); 
	/*
	 * public int selectRecipeOne(String cook);
	 * 
	 * public int selectRecipeList();
	 * 
	 * public int updateRecipeOne(RecipeVO rvo);
	 */
}
