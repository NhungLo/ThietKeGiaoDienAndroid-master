package nhungltpk00606_lab6;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import example.manhinhhieukhienn.com.R;

public class lab6 extends TabActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		TabHost tabhost=getTabHost();
	TabSpec tab1=tabhost.newTabSpec("first");
	TabSpec tab2=tabhost.newTabSpec("second");
	tab1.setIndicator("gioithieu");
	tab1.setContent(new Intent(this,lab6_tab1.class));
	tab2.setIndicator("lienhe");
	tab2.setContent(new Intent(this,lab6_tab2.class));
	tabhost.addTab(tab1);
	tabhost.addTab(tab2);
	
	}
}
