package edu.galileo.android.facebookrecipes.recipelist;

import edu.galileo.android.facebookrecipes.entities.Recipe;

/**
 * Created by ANICOLAS on 21/06/2016.
 */
public interface RecipeListRepository {
    void getSaveRecipes();
    void updateRecipe(Recipe recipe);
    void removeRecipe(Recipe recipe);
    void getFavoritesRecipes();
}
