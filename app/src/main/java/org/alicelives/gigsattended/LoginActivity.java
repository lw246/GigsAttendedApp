package org.alicelives.gigsattended;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class LoginActivity extends AppCompatActivity {

    private final String LogTag = LoginActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void launchGigsAttended(View view) {
        Log.d(LogTag, "Login button clicked");
        Intent intent = new Intent(this, GigsAttendedActivity.class);
        startActivity(intent);
    }
}
