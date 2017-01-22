package edu.galileo.android.facebookrecipes.recipemain;

import org.junit.Test;
import org.mockito.Mock;

import edu.galileo.android.facebookrecipes.BaseTest;
import edu.galileo.android.facebookrecipes.entities.Recipe;

import static org.mockito.Mockito.verify;

/**
 * Created by ANICOLAS on 06/07/2016.
 */
public class SaveRecipeInteractorImplTest extends BaseTest{
    @Mock
    private RecipeMainRepository repository;
    @Mock
    private Recipe recipe;

    private SaveRecipeInteractor interactor;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        interactor = new SaveRecipeInteractorImpl(repository);
    }

    @Test
    public void testExecute_callRepository() throws Exception {
        interactor.execute(recipe);
        verify(repository).saveRecipe(recipe);
    }
}
