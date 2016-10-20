package nhungltpk00606_lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import example.manhinhhieukhienn.com.R;

public class lab3_quenmk extends Activity {
	TextView txtdktk, txtdn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3_quenmk);
		txtdktk=(TextView)findViewById(R.id.register);
		txtdn=(TextView)findViewById(R.id.login);
		txtdktk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),lab3_dk.class);
				startActivity(intent);
				
			}
		});
		txtdn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),lab3.class);
				startActivity(intent);
				
			}
		});
		
	}
}
