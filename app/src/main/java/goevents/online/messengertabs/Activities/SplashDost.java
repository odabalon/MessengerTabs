package goevents.online.messengertabs.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import goevents.online.messengertabs.R;

public class SplashDost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //turn title off
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //set to full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashdost);
        RunMe runme = new RunMe();
        Thread t = new Thread(runme);
        t.start();
    }

    class RunMe implements Runnable {
        @Override
        public void run() {
            SystemClock.sleep(3000);
            Intent intent = new Intent(SplashDost.this,Splash.class);
            startActivity(intent);
            finish();


        }
    }
}
