package com.sts.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.vo.RecipeVO;

@Service
public class RecipeDAO implements RecipeService {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int insertRecipeOne(RecipeVO rvo) {
		return sqlSession.insert("recipeMapper.insertRecipeOne", rvo);
	}

	@Override
	public List<RecipeVO> selectRecipeList() {
		return sqlSession.selectList("recipeMapper.selectRecipeList");
	}
	
	

	/*
	 * @Override public int selectRecipeOne(String cook) { // TODO Auto-generated
	 * method stub return 0; }
	 * 
	 * @Override public int selectRecipeList() { // TODO Auto-generated method stub
	 * return 0; }
	 * 
	 * @Override public int updateRecipeOne(RecipeVO rvo) { // TODO Auto-generated
	 * method stub return 0; }
	 */
	
}
