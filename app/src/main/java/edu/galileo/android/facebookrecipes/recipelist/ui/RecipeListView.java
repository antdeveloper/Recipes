package edu.galileo.android.facebookrecipes.recipelist.ui;

import java.util.List;

import edu.galileo.android.facebookrecipes.entities.Recipe;

/**
 * Created by ANICOLAS on 21/06/2016.
 */
public interface RecipeListView {
    void setRecipes(List<Recipe> data);
    void recipeUpdated();
    void recipeDeleted(Recipe recipe);
}
