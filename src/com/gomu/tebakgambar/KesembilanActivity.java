package com.gomu.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class KesembilanActivity extends Activity {
	EditText jawabanTxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kesembilan);
		jawabanTxt = (EditText)findViewById(R.id.editText1 );
        //set input huruf
        jawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kesembilan, menu);
		return true;
	}
	public void cekJawaban(View v){
    	String jawabanBenar = "SEPAK BOLA";
    	String jawabanUser = jawabanTxt.getText().toString();
    	if(jawabanUser.equals(jawabanBenar)){
    		// pesan toast
    		Toast.makeText(getApplicationContext(), "GAME SELESAI!", Toast.LENGTH_LONG).show();
    		
    	}else{
    		// pesan toast
    		Toast.makeText(getApplicationContext(), "JAWABAN MASIH SALAH!", Toast.LENGTH_LONG).show();
    	   	}
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
