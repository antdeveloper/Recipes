package edu.galileo.android.facebookrecipes.recipelist;

import edu.galileo.android.facebookrecipes.entities.Recipe;
import edu.galileo.android.facebookrecipes.recipelist.events.RecipeListEvent;
import edu.galileo.android.facebookrecipes.recipelist.ui.RecipeListView;

/**
 * Created by ANICOLAS on 21/06/2016.
 */
public interface RecipeListPresenter {
    void onCreate();
    void onDestroy();

    void getRecipes();
    void removeRecipe(Recipe recipe);
    void toogleFavorite(Recipe recipe);
    void onEventMainThread(RecipeListEvent event);

    void showAll();
    void showFavs();

    RecipeListView getView();
}
