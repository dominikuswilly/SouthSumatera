package com.mediaanda.southsumatera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mediaanda.southsumatera.Fragment.AirportFragment;
import com.mediaanda.southsumatera.Fragment.DestinationFragment;
import com.mediaanda.southsumatera.Fragment.FavouriteFragment;
import com.mediaanda.southsumatera.Fragment.PhoneFragment;
import com.mediaanda.southsumatera.Fragment.RestaurantFragment;
import com.mediaanda.southsumatera.Fragment.TaxiFragment;
import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.OnBoomListener;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnBoomListener {

    private BoomMenuButton bmb;
    private ArrayList<Pair> piecesAndButtons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        bmb = (BoomMenuButton) findViewById(R.id.bmb);
        assert bmb != null;
        bmb.clearBuilders();
        bmb.setButtonEnum(ButtonEnum.TextOutsideCircle);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_6_3);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_6_3);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++)
            bmb.addBuilder(BuilderManager.getTextOutsideCircleButtonBuilder());

        bmb.setOnBoomListener(this);

        if(savedInstanceState == null){
            Fragment currentFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, currentFragment)
                    .commit();
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        String title = "";
        Fragment fragment = null;

        if (id == R.id.nav_airport) {
            title = "Airport";
            fragment = new AirportFragment();
        } else if(id == R.id.nav_destination){
            title = "Destination";
            fragment = new DestinationFragment();
        } else if(id == R.id.nav_transportation){
            title = "Transportation";
            fragment = new TransportationFragment();
        } else if(id == R.id.nav_restaurant){
            title = "Restaurant";
            fragment = new RestaurantFragment();
        } else if(id == R.id.nav_event){
            title = "Event";
            fragment = new EventFragment();
        } else if(id == R.id.nav_phone){
            title = "Phone";
            fragment = new PhoneFragment();
        } else if(id == R.id.nav_hotel){
            fragment = new HotelFragment();
        } else if(id == R.id.nav_favourite){
            fragment = new FavouriteFragment();
        }

        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClicked(int index, BoomButton boomButton) {
        int id = index;
        String title = "";
        Fragment fragment = null;

        if(id == 0){ // Hotel
            fragment = new HotelFragment();
        } else if(id == 1){ // Airport
            fragment = new AirportFragment();
        } else if(id == 2){ // Event
            fragment = new EventFragment();
        } else if(id == 3){ // Favourite
            fragment = new FavouriteFragment();
        } else if(id == 4){ // Restaurant
            fragment = new RestaurantFragment();
        } else if(id ==5){ // Transportation
            fragment = new TransportationFragment();
        }

        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
        }
    }

    @Override
    public void onBackgroundClick() {

    }

    @Override
    public void onBoomWillHide() {

    }

    @Override
    public void onBoomDidHide() {

    }

    @Override
    public void onBoomWillShow() {

    }

    @Override
    public void onBoomDidShow() {

    }
}
