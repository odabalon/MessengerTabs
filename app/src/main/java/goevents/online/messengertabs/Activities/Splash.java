package goevents.online.messengertabs.Activities;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import goevents.online.messengertabs.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //turn title off
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //set to full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        RunMe runme = new RunMe();
        Thread t = new Thread(runme);
        t.start();
    }

    class RunMe implements Runnable {
        @Override
        public void run() {
            SystemClock.sleep(3000);
            Intent intent = new Intent(Splash.this,MainActivity.class);
            startActivity(intent);
            finish();


        }
    }
}
