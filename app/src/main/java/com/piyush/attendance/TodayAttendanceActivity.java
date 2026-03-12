
package com.piyush.attendance;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TodayAttendanceActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        TextView t = findViewById(R.id.todaySubjects);
        t.setText("Today's timetable attendance screen");
    }
}
