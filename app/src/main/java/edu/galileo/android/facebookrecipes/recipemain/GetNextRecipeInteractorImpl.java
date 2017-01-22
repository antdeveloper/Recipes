package edu.galileo.android.facebookrecipes.recipemain;

import java.util.Random;

/**
 * Created by ANICOLAS on 20/06/2016.
 */
public class GetNextRecipeInteractorImpl implements GetNextRecipeInteractor{
    RecipeMainRepository repository;

    public GetNextRecipeInteractorImpl(RecipeMainRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        int recipePage = new Random().nextInt(RecipeMainRepository.RECIPE_RANGE);
        repository.setRecipePage(recipePage);
        repository.getNextRecipe();
    }
}
