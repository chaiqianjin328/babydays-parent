package com.babydays.service;

import com.babydays.model.BRecipes;
import com.babydays.model.ListResult;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;

public interface RecipesService {

	void addRecipes(BRecipes recipes) throws Exception;

	void updateRecipes(BRecipes recipes) throws Exception;

	void deleteRecipesById(Integer id) throws Exception;

	ListResult recipesList(HashMap<String, Object> valMap);

	PageInfo<BRecipes> getRecipes(String query, Integer pageNum, Integer pageSize, Integer gardenId, Integer classId) throws Exception;

}
