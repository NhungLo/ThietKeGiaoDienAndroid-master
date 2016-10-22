package nhungltpk00606_lab7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import example.manhinhhieukhienn.com.R;

public class lab7_kq extends Activity{
	Button back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab7_ketqua);
		back=(Button)findViewById(R.id.btnBacklab7);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getApplicationContext(),lab7.class);
				startActivity(intent);
				
			}
		});
	}
}
