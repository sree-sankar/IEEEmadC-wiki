package ieee.madC.swift.app;


import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    final Fragment fragment1 = new IPC();
    final Fragment fragment2 = new Court();
    final Fragment fragment3 = new Lawers();
    BottomNavigationView bottomNavigationView;
    Fragment active = fragment1;
    final FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fm.beginTransaction().add(R.id.fragmentguest,fragment1).commit();
        fm.beginTransaction().add(R.id.fragmentguest, fragment2).hide(fragment2).commit();
        fm.beginTransaction().add(R.id.fragmentguest, fragment3).hide(fragment3).commit();

    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.eventsguest:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    bottomNavigationView.setBackgroundColor(getResources().getColor(R.color.ipc));
                    break;

                case R.id.about_usguest:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    bottomNavigationView.setBackgroundColor(getResources().getColor(R.color.court));
                    active =fragment2;
                    break;


                case R.id.result:
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    bottomNavigationView.setBackgroundColor(getResources().getColor(R.color.lawers));

                    break;

            }
            return true;
        }
    };


    private boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            finish();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click Back again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(() -> doubleBackToExitPressedOnce=false, 2000);
    }
}

