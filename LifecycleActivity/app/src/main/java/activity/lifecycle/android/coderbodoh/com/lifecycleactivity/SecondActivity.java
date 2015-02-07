package activity.lifecycle.android.coderbodoh.com.lifecycleactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Created by CoderBodoh on 2/8/2015.
 */
public class SecondActivity extends TracerActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
