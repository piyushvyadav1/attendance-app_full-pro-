
package com.piyush.attendance;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        TextView t = findViewById(R.id.reportText);
        t.setText("Attendance report with 86% IA requirement");
    }
}
