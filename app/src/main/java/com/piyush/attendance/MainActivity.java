
package com.piyush.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button today = findViewById(R.id.btnToday);
        Button report = findViewById(R.id.btnReport);
        Button calendar = findViewById(R.id.btnCalendar);
        Button ia = findViewById(R.id.btnIA);

        today.setOnClickListener(v -> startActivity(new Intent(this, TodayAttendanceActivity.class)));
        report.setOnClickListener(v -> startActivity(new Intent(this, ReportActivity.class)));
        calendar.setOnClickListener(v -> startActivity(new Intent(this, CalendarActivity.class)));
        ia.setOnClickListener(v -> startActivity(new Intent(this, IAPlannerActivity.class)));
    }
}
