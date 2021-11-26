package com.example.topic7_task6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    private ListView listView;
    private ItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(android.R.id.list);
        ArrayList<Dessert> dessertList = new ArrayList<>();
        dessertList.add(new Dessert(R.drawable.donut_circle, getResources().getString(R.string.donuts) ));
        dessertList.add(new Dessert(R.drawable.icecream_circle,getResources().getString(R.string.ice_cream_sandwiches) ));
        dessertList.add(new Dessert(R.drawable.froyo_circle, getResources().getString(R.string.froyo)  ));

        mAdapter = new ItemAdapter(this,dessertList);
        listView.setAdapter(mAdapter);
    }

    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        //Toast.makeText(this, ""+position, Toast.LENGTH_LONG).show();
        switch(position)
        {
            case 0 :
                showDonutOrder(v);
                break;
            case 1 :
                showIceCreamOrder(v);
                break;
            case 2:
                showFroyoOrder(v);
                break;
            default :
                Toast.makeText(this, "No has clicado nada", Toast.LENGTH_LONG).show();
        }
    }


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Shows a message that the donut image was clicked.
     */
    public void showDonutOrder(View view) {
        showFoodOrder(getString(R.string.donut_order_message));
    }

    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    public void showIceCreamOrder(View view) {
        showFoodOrder(getString(R.string.ice_cream_order_message));
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {
        showFoodOrder(getString(R.string.froyo_order_message));
    }

    /**
     * Displays a toast message for the food order
     * and starts the OrderActivity activity.
     * @parammessage Message to display.
     */
    public void showFoodOrder(String message) {
        displayToast(message);
        Intent intent = new Intent(this,OrderActivity.class); startActivity(intent);
    }
}