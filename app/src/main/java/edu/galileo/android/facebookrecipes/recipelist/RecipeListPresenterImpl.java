package edu.galileo.android.facebookrecipes.recipelist;

import org.greenrobot.eventbus.Subscribe;

import edu.galileo.android.facebookrecipes.entities.Recipe;
import edu.galileo.android.facebookrecipes.libs.base.EventBus;
import edu.galileo.android.facebookrecipes.recipelist.events.RecipeListEvent;
import edu.galileo.android.facebookrecipes.recipelist.ui.RecipeListView;

/**
 * Created by ANICOLAS on 21/06/2016.
 */
public class RecipeListPresenterImpl implements RecipeListPresenter{
    private EventBus eventBus;
    private RecipeListView view;
    private RecipeListInteractor listInteractor;
    private StoreRecipesInteractor storeInteractor;

    public RecipeListPresenterImpl(EventBus eventBus, RecipeListView view, RecipeListInteractor listInteractor, StoreRecipesInteractor storeInteractor) {
        this.eventBus = eventBus;
        this.view = view;
        this.listInteractor = listInteractor;
        this.storeInteractor = storeInteractor;
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        eventBus.unregister(this);
        view = null;
    }

    @Override
    public void getRecipes() {
        listInteractor.execute();
    }

    @Override
    public void removeRecipe(Recipe recipe) {
        storeInteractor.executeDelete(recipe);
    }

    @Override
    public void toogleFavorite(Recipe recipe) {
        boolean fav = recipe.getFavorite();
        recipe.setFavorite(!fav);
        storeInteractor.executeUpdate(recipe);
    }

    @Override
    @Subscribe
    public void onEventMainThread(RecipeListEvent event) {
        if (this.view != null){
            switch (event.getType()){
                case RecipeListEvent.READ_EVENT:{
                    view.setRecipes(event.getRecipeList());
                    break;
                }
                case RecipeListEvent.UPDATE_EVENT:{
                    view.recipeUpdated();
                    break;
                }
                case RecipeListEvent.DELETE_EVENT:{
                    Recipe recipe = event.getRecipeList().get(0);
                    view.recipeDeleted(recipe);
                    break;
                }
            }
        }
    }

    @Override
    public void showAll() {
        listInteractor.execute();
    }

    @Override
    public void showFavs() {
        listInteractor.searchFavs();
    }

    @Override
    public RecipeListView getView() {
        return this.view;
    }
}
