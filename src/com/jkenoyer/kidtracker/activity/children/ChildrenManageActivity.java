package com.jkenoyer.kidtracker.activity.children;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.jkenoyer.kidtracker.R;
import com.jkenoyer.kidtracker.activity.BaseActivity;

public class ChildrenManageActivity extends BaseActivity {
	
	@Override
	public void init(){
		
		setContentView(R.layout.childrenmanageview);		

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
