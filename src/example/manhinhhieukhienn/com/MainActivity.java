package example.manhinhhieukhienn.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import example.manhinhhieukhienn.com.R;
import nhungltpk00606_lab1.lab1;
import nhungltpk00606_lab2.lab2;
import nhungltpk00606_lab3.lab3;
import nhungltpk00606_lab4.lab4;
import nhungltpk00606_lab5.lab5;
import nhungltpk00606_lab6.lab6;
import nhungltpk00606_lab7.lab7;
import nhungltpk00606_lab8.lab8;


public class MainActivity extends Activity implements OnClickListener {
	Button btnlab1,btnlab2,btnlab3,btnlab4,btnlab5,btnlab6,btnlab7,btnlab8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnlab1=(Button)findViewById(R.id.btn1);
		btnlab2=(Button)findViewById(R.id.btn2);
		btnlab3=(Button)findViewById(R.id.btn3);
		btnlab4=(Button)findViewById(R.id.btn4);
		btnlab5=(Button)findViewById(R.id.btn5);
		btnlab6=(Button)findViewById(R.id.btn6);
		btnlab7=(Button)findViewById(R.id.btn7);
		btnlab8=(Button)findViewById(R.id.btn8);
		
		btnlab1.setOnClickListener(this);
		btnlab2.setOnClickListener(this);
		btnlab3.setOnClickListener(this);
		btnlab4.setOnClickListener(this);
		btnlab5.setOnClickListener(this);
		btnlab6.setOnClickListener(this);
		btnlab7.setOnClickListener(this);
		btnlab8.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v==btnlab1){
			Intent intent = new Intent(getApplicationContext(),lab1.class);
			startActivity(intent);
		}
		if(v==btnlab2){
			Intent intent = new Intent(getApplicationContext(),lab2.class);
			startActivity(intent);
		}
		if(v==btnlab3){
			Intent intent = new Intent(getApplicationContext(),lab3.class);
			startActivity(intent);
		}
		if(v==btnlab4){
			Intent intent = new Intent(getApplicationContext(),lab4.class);
			startActivity(intent);
		}
		if(v==btnlab5){
			Intent intent = new Intent(getApplicationContext(),lab5.class);
			startActivity(intent);
		}
		if(v==btnlab6){
			Intent intent = new Intent(getApplicationContext(),lab6.class);
			startActivity(intent);
		}
//		if(v==btnlab7){
//			Intent intent = new Intent(getApplicationContext(),lab7.class);
//			startActivity(intent);
//		}
//		if(v==btnlab8){
//			Intent intent = new Intent(getApplicationContext(),lab8.class);
//			startActivity(intent);
//		}
		
	}

}
