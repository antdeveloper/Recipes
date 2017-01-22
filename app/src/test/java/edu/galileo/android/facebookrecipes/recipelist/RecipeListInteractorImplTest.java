package edu.galileo.android.facebookrecipes.recipelist;

import org.junit.Test;
import org.mockito.Mock;

import edu.galileo.android.facebookrecipes.BaseTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by ANICOLAS on 07/07/2016.
 */
public class RecipeListInteractorImplTest extends BaseTest{
    @Mock
    private RecipeListRepository repository;
    private RecipeListInteractorImpl interactor;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        interactor = new RecipeListInteractorImpl(repository);
    }

    @Test
    public void testExecute_ShouldCallRepository() throws Exception {
        interactor.execute();
        verify(repository).getSaveRecipes();
    }
}