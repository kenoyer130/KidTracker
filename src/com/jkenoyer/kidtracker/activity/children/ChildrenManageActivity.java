package com.jkenoyer.kidtracker.activity.children;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jkenoyer.kidtracker.R;
import com.jkenoyer.kidtracker.activity.BaseActivity;
import com.jkenoyer.kidtracker.activity.main.MainActivity;
import com.jkenoyer.kidtracker.model.IChildProvider;
import com.jkenoyer.kidtracker.model.ProviderFactory;

public class ChildrenManageActivity extends BaseActivity {
	
	private IChildProvider provider;
	
	public ChildrenManageActivity(){
		provider = ProviderFactory.getChildProvider(this);
	}
	
	/** Called when the activity is first created. */
	@Override
	public void init(){

		setContentView(R.layout.childrenmanageview);

		// btnBack
		Button btnBack = (Button) findViewById(R.id.btnBack);
		btnBack.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), MainActivity.class);
				startActivityForResult(intent, 0);
			}
		});

		// btnCreateChild
		Button btnCreateChild = (Button) findViewById(R.id.btnCreateChild);
		btnCreateChild.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),
						ChildrenNewActivity.class);
				startActivityForResult(intent, 0);
			}
		});
	}
}
