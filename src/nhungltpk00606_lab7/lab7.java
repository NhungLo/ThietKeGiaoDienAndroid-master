package nhungltpk00606_lab7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import example.manhinhhieukhienn.com.R;

public class lab7 extends Activity{
	Button tinh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7);
		tinh=(Button)findViewById(R.id.btnkqlab7);
		tinh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getApplicationContext(),lab7_kq.class);
				startActivity(intent);
				
			}
		});
	}
}
