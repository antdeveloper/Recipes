package edu.galileo.android.facebookrecipes;

import org.junit.Before;
import org.mockito.MockitoAnnotations;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.Shadows;
import org.robolectric.internal.Shadow;
import org.robolectric.shadows.ShadowApplication;

/**
 * Created by ANICOLAS on 06/07/2016.
 */
public abstract class BaseTest {
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        if (RuntimeEnvironment.application != null){
            ShadowApplication shadowApp = Shadows.shadowOf(RuntimeEnvironment.application);
            shadowApp.grantPermissions("android.permission.INTERNET");
        }
    }
}
