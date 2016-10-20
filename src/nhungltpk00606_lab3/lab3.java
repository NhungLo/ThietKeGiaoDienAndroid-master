package nhungltpk00606_lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import example.manhinhhieukhienn.com.R;

public class lab3 extends Activity{
	TextView txtdk, txtqmk;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3);
		txtqmk=(TextView)findViewById(R.id.forrrgot);
		txtdk=(TextView)findViewById(R.id.regissster);
		txtdk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getApplicationContext(),lab3_dk.class);
				startActivity(intent);
			}
		});
		txtqmk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),lab3_quenmk.class);
				startActivity(intent);
				
			}
		});
	}
}
