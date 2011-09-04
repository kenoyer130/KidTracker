package com.jkenoyer.kidtracker.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.Helloandriod.R;
import com.jkenoyer.kidtracker.activity.BaseActivity;
import com.jkenoyer.kidtracker.activity.children.ChildrenManageActivity;

public class MainActivity extends BaseActivity{
	
	private static Activity appContext;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		
		appContext = this;

		// top label
		TextView tv = new TextView(this);
		tv.setText("Kid Tracker");

		// btnManageChildren
		Button btnManageChildren = (Button) findViewById(R.id.btnManageChildren);
		btnManageChildren.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),ChildrenManageActivity.class);
				startActivityForResult(intent, 0);
			}
		});

		// btnManageMerits
		Button btnManageMerits = (Button) findViewById(R.id.btnManageMerits);
		btnManageMerits.setOnClickListener(null);
	}	
}