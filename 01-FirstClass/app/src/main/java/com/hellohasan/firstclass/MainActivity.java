/*
 * Android Ninja - Class No: 1 [18 August, 2017]
 * Topics:
 * - ConstraintLayout
 * - TextView
 * - Button
 * - Click listener Java method
 * - Toast
 * - Intent (start another activity)
 */

package com.hellohasan.firstclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Toast from first activity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
