package goevents.online.messengertabs.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import goevents.online.messengertabs.R;

public class login extends AppCompatActivity {


    Button login, register;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


         Button login = (Button)findViewById(R.id.login);

         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(login.this, MainActivity.class);
                 startActivity(intent);
             }
         });

         Button register = (Button)findViewById(R.id.reg);
         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(login.this, register.class);
                 startActivity(intent);
             }
         });
    }
}
