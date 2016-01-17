package com.example.pra.bitcoin;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.RequestQueue;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    JSONObject jsonobject;
    JSONArray jsonArray;
    TextView bitcoin, currency;
    Button show;
    Spinner bitcoin_spin, currency_spin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitcoin_spin = (Spinner)findViewById(R.id.bitcoin_spin);
        currency_spin = (Spinner)findViewById(R.id.currency_spin);
        bitcoin = (TextView)findViewById(R.id.bitcoin);
        currency = (TextView)findViewById(R.id.currency);
        show =(Button)findViewById(R.id.bt_show);

        new SelectJSON().execute();

    }

    private class SelectJSON extends AsyncTask<Void, Void, Void> {

        protected Void doInBackground(Void... params) {
            // Locate the WorldPopulation Class
            world = new ArrayList<WorldPopulation>();
            // Create an array to populate the spinner
            worldlist = new ArrayList<String>();
            // JSON file URL address
            jsonobject = JSONfunctions
                    .getJSONfromURL("http://api.coindesk.com/v1/bpi/currentprice.json")
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
}
