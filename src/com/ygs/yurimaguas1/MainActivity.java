package com.ygs.yurimaguas1;

import com.ygs.yurimaguas1.view.CircleFragment;
import com.ygs.yurimaguas1.view.CircleFragment.OnTimeSetListener;
import com.ygs.yurimaguas1.view.RadialPickerLayout;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.Window;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        new CircleFragment();
		getSupportFragmentManager()
        .beginTransaction()
        .add(R.id.fragment_content, CircleFragment.newInstance(new OnTimeSetListener() {
			
			public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
				// TODO Auto-generated method stub
				
			}
		}, 3, 12, false))
        .commit();
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
}
