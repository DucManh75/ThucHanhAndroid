package com.example.lab2a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_ot_file:
                Toast.makeText(getApplicationContext(), "File", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_ot_edit:
                Toast.makeText(getApplicationContext(), "Edit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_ot_view:
                Toast.makeText(getApplicationContext(), "View", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_ot_tool:
                Toast.makeText(getApplicationContext(), "Tool", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}