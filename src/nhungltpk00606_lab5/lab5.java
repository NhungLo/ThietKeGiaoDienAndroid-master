package nhungltpk00606_lab5;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import example.manhinhhieukhienn.com.R;

public class lab5 extends Activity {
	Button btndk;
	Dialog dialogdk;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab5);
		btndk=(Button)findViewById(R.id.btndk);
		btndk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dialogDk();
				
			}

		});
	}
	private void dialogDk() {
		dialogdk=new Dialog(this);
		dialogdk.requestWindowFeature(dialogdk.getWindow().FEATURE_NO_TITLE);
		dialogdk.setContentView(R.layout.activity_lab5_dk);
		dialogdk.setTitle("Đăng kí");
		
		dialogdk.show();
		
	}
}
