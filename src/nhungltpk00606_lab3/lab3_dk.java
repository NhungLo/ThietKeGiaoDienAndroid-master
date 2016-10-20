package nhungltpk00606_lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import example.manhinhhieukhienn.com.R;

public class lab3_dk extends Activity{
	TextView txtlogin,txtforgot;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3_dk);
		txtlogin=(TextView)findViewById(R.id.loggin);
		txtforgot=(TextView)findViewById(R.id.forrgot);
		txtlogin.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),lab3.class);
				startActivity(intent);
				
			}
		});
		txtforgot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),lab3_quenmk.class);
				startActivity(intent);
				
			}
		});
	}
}
