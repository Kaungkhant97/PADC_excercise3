package com.kaungkhantthu.padcexercise3.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.kaungkhantthu.padcexercise3.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private FrameLayout content_frame;
    private Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        content_frame = (FrameLayout) findViewById(R.id.content_Frame);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(toolbar);
        fragment = Linkedin_Fragment.newInstance();
        changeFragment(fragment);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("PADC Linkedin");

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
        if (id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(final MenuItem item) {
        item.setChecked(true);
        drawerLayout.closeDrawer(GravityCompat.START);
        getSupportActionBar().setTitle(item.getTitle());
        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    switch (item.getItemId()) {
                        case R.id.linkedinItem:
                            changeFragment(Linkedin_Fragment.newInstance());


                            break;
                        case R.id.jobSearchItem:
                            changeFragment(Jobsearch_Fragment.newInstance());

                            break;
                        case R.id.pulse:
                            changeFragment(PulseFragment.newInstance());

                            break;
                        case R.id.yoteshin:
                            changeFragment(YoteShinFragment.newInstance());
                            break;
                        case R.id.winzinn:
                            changeFragment(WinZinnFragment.newInstance());

                            break;
                    }
                }

            }, 250);

            return true;

    }
    private void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_Frame,fragment).commit();
    }
}
