package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button b;
    Button c;
    Button d;
    Button e;
    int counter = 0;
    TextView t;
    //co

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.aaaaaaaa);
        /*Log.d("VIVZ","onCreate has started");

        b=(Button) findViewById(R.id.button_1);
        c=findViewById(R.id.button_2);
        d=findViewById(R.id.button_3);
        e=findViewById(R.id.button_4);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u=Uri.parse("geo:19.076,72.8777");
                Intent intent=new Intent(Intent.ACTION_VIEW,u);
                Intent chooser=intent.createChooser(intent,"Launch Maps");
                startActivity(chooser);
            }
        });
        c.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u=Uri.parse("https://play.google.com/store/apps/details?id=com.apps.greatbook.socialengineering&hl=en ");
                Intent intent=new Intent(Intent.ACTION_VIEW,u);
                Intent chooser=intent.createChooser(intent,"Choose App");
                startActivity(chooser);
            }
        });
        d.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uri u=Uri.parse("mailto:");
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                //String to[]={"singhsatwik7515@gmail.com","shivam.raj2603@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,"singhsatwik7515@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");
                startActivity(intent.createChooser(intent,"Send mail via"));
            }
        });
        e.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri imageUri=Uri.parse("android.resource://com.example.myapplication/drawable"+R.drawable.ic_launcher_foreground);
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_STREAM,imageUri);
                Intent chooser=intent.createChooser(intent,"Send Image Bro");
                startActivity(chooser);
            }
        });*/


    }
    /*OnClickListener obb=new OnClickListener() {
        @Override
        public void onClick(View v){
            Log.d("VIVZ","Button 1 was clicked ");
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("counter","counter was saved as "+counter );
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter++;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("counter",counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter=savedInstanceState.getInt("counter");
    }*/
    /*@Override
    protected void onStart() {
        super.onStart();
        Log.d("VIVZ","onStart has started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("VIVZ","onPause has started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("VIVZ","onResume has started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("VIVZ","onStop has started");

    }
    //comment added
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VIVZ","onDestroy has started");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
        Log.d("VIVZ","orientation changed to Landscape");
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
            Log.d("VIVZ","orientation changed to Portrait ");
    }
    public void doSomething(View view){
        Log.d("VIVZ",view.getId()+"Button was Clicked");
    }*/

}
