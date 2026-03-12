
package com.piyush.attendance;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IAPlannerActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ia);

        TextView t = findViewById(R.id.iaText);
        t.setText("IA planner - minimum attendance 86%");
    }
}
