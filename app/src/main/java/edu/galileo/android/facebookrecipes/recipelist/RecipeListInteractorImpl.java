package edu.galileo.android.facebookrecipes.recipelist;

/**
 * Created by ANICOLAS on 21/06/2016.
 */
public class RecipeListInteractorImpl implements RecipeListInteractor{
    private RecipeListRepository repository;

    public RecipeListInteractorImpl(RecipeListRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        repository.getSaveRecipes();
    }

    @Override
    public void searchFavs() {
        repository.getFavoritesRecipes();
    }
}
