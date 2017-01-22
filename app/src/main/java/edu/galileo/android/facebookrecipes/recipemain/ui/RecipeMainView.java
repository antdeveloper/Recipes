package edu.galileo.android.facebookrecipes.recipemain.ui;

import edu.galileo.android.facebookrecipes.entities.Recipe;

/**
 * Created by ANICOLAS on 20/06/2016.
 */
public interface RecipeMainView {
    void showProgress();
    void hideProgress();
    void showUIElements();
    void hideUIElements();
    void saveAnimations();
    void dismissAnimation();

    void onRecipeSaved();
    void setRecipe(Recipe recipe);
    void getRecipeError(String error);
}
