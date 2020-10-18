package com.example.carstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class SecondaryActivity extends AppCompatActivity {

    private int carId =-1 ;

    private EditText details_et;
    private EditText color_et;
    private EditText distance_et;
    private EditText description_et;
    private ImageView clickImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        details_et = findViewById(R.id.details_et_secondaer);
        color_et = findViewById(R.id.color_et_secondaer);
        distance_et = findViewById(R.id.distance_et_secondaer);
        description_et = findViewById(R.id.distance_et_secondaer);
        clickImage = findViewById(R.id.clickToInsertPhoto_iv_secondary);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.secondary_activity, menu);
        MenuItem save = menu.findItem(R.id.save);
        MenuItem edit = menu.findItem(R.id.edit);
        MenuItem delete = menu.findItem(R.id.delete);
        View v = delete.getActionView();

        if (carId == -1) {
            //عمليه أضافه
            save.setVisible(true);
            edit.setVisible(false);
            delete.setVisible(false);
        } else {
            //عمليه عرض
            save.setVisible(false);
            edit.setVisible(true);
            delete.setVisible(true);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                return true;

            case R.id.delete:
                return true;

            case R.id.edit:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}