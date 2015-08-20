package com.example.rd.acionbarapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends Activity {

    // Declaring our tabs and the corresponding fragments.
    ActionBar.Tab bmwTab, fordTab, toyotaTab;
    Fragment bmwFragmentTab = new BmwFragmentTab();
    Fragment toyotaFragmentTab = new ToyotaFragmentTab();
    Fragment fordFragmentTab = new FordFragmentTab();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);

        // Asking for the default ActionBar element that our platform supports.
        ActionBar actionBar = getActionBar();

        // Creating ActionBar tabs.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Setting custom tab icons.
        bmwTab = actionBar.newTab().setText(R.string.bmw);
        toyotaTab = actionBar.newTab().setText(R.string.toyota);
        fordTab = actionBar.newTab().setText(R.string.ford);

        // Setting tab listeners.
        bmwTab.setTabListener(new TabListener(bmwFragmentTab));
        toyotaTab.setTabListener(new TabListener(toyotaFragmentTab));
        fordTab.setTabListener(new TabListener(fordFragmentTab));

        // Adding tabs to the ActionBar.
        actionBar.addTab(bmwTab);
        actionBar.addTab(toyotaTab);
        actionBar.addTab(fordTab);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
