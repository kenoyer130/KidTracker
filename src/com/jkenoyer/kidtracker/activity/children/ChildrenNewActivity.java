package com.jkenoyer.kidtracker.activity.children;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jkenoyer.kidtracker.R;
import com.jkenoyer.kidtracker.activity.BaseActivity;
import com.jkenoyer.kidtracker.model.Child;
import com.jkenoyer.kidtracker.model.IChildProvider;
import com.jkenoyer.kidtracker.model.ProviderFactory;

public class ChildrenNewActivity extends BaseActivity {
	
	private IChildProvider provider;
	
	public ChildrenNewActivity(){
		provider = ProviderFactory.getChildProvider(this);
	}
	
	/** Called when the activity is first created. */
	@Override
	public void init() {

		setContentView(R.layout.childrennewview);

		// btnBack
		Button btnBack = (Button) findViewById(R.id.btnBack);
		btnBack.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				goBack(v);
			}
		});

		final TextView txtName = (TextView) findViewById(R.id.txtName);

		// btnCreateChild
		Button btnCreateChild = (Button) findViewById(R.id.btnCreateChild);
		btnCreateChild.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (txtName.getText() == "")
					return;

				Child child = new Child();
				child.setName((String) txtName.getText());
				provider.save(child);
				goBack(v);
			}			
		});
	}
	
	private void goBack(View v) {
		Intent intent = new Intent(v.getContext(),
				ChildrenManageActivity.class);
		startActivityForResult(intent, 0);

	}
}
