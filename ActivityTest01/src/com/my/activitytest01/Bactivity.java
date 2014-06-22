package com.my.activitytest01;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import android.widget.*;


public class Bactivity extends Activity {
	
	private Button btn;
	private TextView tv;

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_bactivity);
	        
	        btn=(Button) findViewById(R.id.btnB);
	        tv=(TextView)findViewById(R.id.tvB);
	        String re=getIntent().getStringExtra("t");
	        tv.setText(re);
	        btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent data=new Intent();
					data.putExtra("back", "我是B返回回来的数据");
					setResult(0, data);
					finish();
				}
			});
	 }
}
