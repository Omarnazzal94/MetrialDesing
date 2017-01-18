package com.example.omar.theme;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragDrawer.FragmentDrawerListener {
  private Toolbar mtoolbar;
    private FragDrawer drawerFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        drawerFrag =(FragDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFrag.setUp(R.id.fragment_navigation_drawer ,(DrawerLayout)findViewById(R.id.drawer_layout),mtoolbar);
        drawerFrag.setDrawerListener(this);
        displayView(0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        if (id == R.id.action_search)
        {
            Toast.makeText(getApplicationContext(),"Search item is seleceted",Toast.LENGTH_SHORT).show();
            return true;
        }
            return super.onOptionsItemSelected(item);

    }
    @Override
    public void onDrawerItemSelected(View view, int position) {
                displayView(position);
    }

    private void displayView(int position)
    {


    Fragment fragment = null;
    String title = getString(R.string.app_name);
    switch (position) {
        case 0:
            fragment = new HomeFragment();
            title = getString(R.string.title_home);
            break;
        case 1:
            fragment = new FriendFragment();
            title = getString(R.string.title_friends);
            break;
        case 2:
            fragment = new MeFragment();
            title = getString(R.string.title_me);
            break;
        default:
            break;
    }

    if (fragment != null) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_body, fragment);
        fragmentTransaction.commit();

        // set the toolbar title
        getSupportActionBar().setTitle(title);
    }
}
}
