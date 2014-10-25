package com.daftpunk;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	MediaPlayer mediaPlayer,loop;
	int length=0;
	int length2=0;
	boolean player=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button play=(Button)findViewById(R.id.play);
		final Button pause=(Button)findViewById(R.id.pause);
		pause.setEnabled(false);
		final Button stop=(Button)findViewById(R.id.stop);
		stop.setEnabled(false);
		
		
		
		play.setOnClickListener(new OnClickListener(){	
			@Override
			public void onClick(View v) {
				
				play.setText("Play");
				if(player==false)
				{	
					loop=MediaPlayer.create(getApplicationContext(),R.raw.instrumental);
					loop.start();
				}
				else
				{
					loop.seekTo(length);
					loop.start();
				}
				play.setEnabled(false);
				pause.setEnabled(true);
				stop.setEnabled(true);
				player=true;
				
			}
		});
		
		
		
		pause.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				loop.pause();
				play.setEnabled(true);
				play.setText("Resume");
				pause.setEnabled(false);
				length=loop.getCurrentPosition();
				player=false;
			}
		});
		
		/*stop.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				loop.stop();
				play.setEnabled(true);
				player=true;
			}
		});
		*/
		
		//workit
		Button workit= (Button) findViewById(R.id.workit);
		workit.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
			if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
			{
				mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.work_it_2);
			}
			else
			{
				mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.work_it_1);
			}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		
		
		//makeit
		Button makeit= (Button) findViewById(R.id.makeit);
		makeit.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.make_it_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.make_it_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//doit
		Button doit= (Button) findViewById(R.id.doit);
		doit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.do_it_2);
				}
				else
					{
					mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.do_it_1);
					}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//makesus
		Button makesus= (Button) findViewById(R.id.makesus);
		makesus.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.makes_us_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.makes_us_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//harder
		Button harder= (Button) findViewById(R.id.harder);
		harder.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.harder_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.harder_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//better
		Button better= (Button) findViewById(R.id.better);
		better.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.better_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.better_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//faster
		Button faster= (Button) findViewById(R.id.faster);
		faster.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.faster_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.faster_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//stronger
		Button stronger= (Button) findViewById(R.id.stronger);
		stronger.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stronger_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stronger_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//morethan
		Button morethan= (Button) findViewById(R.id.morethan);
		morethan.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.more_than_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.more_than_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//hour
		Button hour= (Button) findViewById(R.id.hour);
		hour.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hour_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hour_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//our
		Button our= (Button) findViewById(R.id.our);
		our.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.our_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.our_1);
				}
					mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//never
		Button never= (Button) findViewById(R.id.never);
		never.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.never_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.never_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//ever
		Button ever= (Button) findViewById(R.id.ever);
		ever.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ever_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ever_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//after
		Button after= (Button) findViewById(R.id.after);
		after.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.after_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.after_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//workis
		Button workis= (Button) findViewById(R.id.workis);
		workis.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.work_is_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.work_is_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
		
		//over
		Button over= (Button) findViewById(R.id.over);
		over.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton) findViewById(R.id.toggleButton1)).isChecked())
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.over_2);
				}
				else
				{
					mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.over_1);
				}
				mediaPlayer.start();
				player_release(mediaPlayer);
			}
		});
	}
	public void player_release(MediaPlayer mp)
	{
	mp.setOnCompletionListener(new OnCompletionListener() {
	    public void onCompletion(MediaPlayer mp) {
	        mp.release();
	    }
	});
	}		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}