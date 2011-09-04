package com.jkenoyer.kidtracker.activity.children;

import com.jkenoyer.kidtracker.R;
import com.jkenoyer.kidtracker.model.IChildProvider;
import com.jkenoyer.kidtracker.model.ProviderFactory;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChildrenListActivity extends ListActivity {

	private IChildProvider provider;

	public ChildrenListActivity() {
		provider = ProviderFactory.getChildProvider(this);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.childrenlistview, (String[]) provider.readAll().toArray()));

		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
	}
}
