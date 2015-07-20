package com.atomssa.andnd.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int BUTTONS[] = { R.id.streamer, R.id.scores,
            R.id.library, R.id.bigger, R.id.xyz, R.id.capstone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<BUTTONS.length; ++i) {
            findViewById(BUTTONS[i]).setOnClickListener(this);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private String toastMessage(int appNameResource) {
        return "This is the button for app " + getString(appNameResource);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.streamer:
                Toast.makeText(this, toastMessage(R.string.streamer), Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(this, toastMessage(R.string.scores), Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this, toastMessage(R.string.library), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigger:
                Toast.makeText(this, toastMessage(R.string.bigger), Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz:
                Toast.makeText(this, toastMessage(R.string.xyz), Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this, toastMessage(R.string.capstone), Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Unknown view id", Toast.LENGTH_SHORT).show();
        }
    }
}
