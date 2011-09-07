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

	public ChildrenNewActivity() {
		
	}

	/** Called when the activity is first created. */
	@Override
	public void init() {
		provider = ProviderFactory.getChildProvider(this);
		setContentView(R.layout.childrennewview);

		final TextView txtName = (TextView) findViewById(R.id.txtName);

		// btnCreateChild
		Button btnSave = (Button) findViewById(R.id.btnSave);
		btnSave.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				String name = txtName.getText().toString();
				if (name == "" || name == null)
					return;

				Child child = new Child();
				child.setName(name);
				provider.save(child);
				goBack(v);
			}
		});
	}

	private void goBack(View v) {
		Intent intent = new Intent(v.getContext(), ChildrenManageActivity.class);
		startActivityForResult(intent, 0);
	}
}
