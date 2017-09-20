package goevents.online.messengertabs.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import goevents.online.messengertabs.Fragments.Videos;
import goevents.online.messengertabs.Fragments.Photos;
import goevents.online.messengertabs.Fragments.Nenews;
import goevents.online.messengertabs.Fragments.LatestNews;
import goevents.online.messengertabs.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] tabIcons = {
            R.drawable.icon_list,
            R.drawable.icon_call,
            R.drawable.icon_people,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(false); // disable the button
        getSupportActionBar().setDisplayHomeAsUpEnabled(false); // remove the left caret
        getSupportActionBar().setDisplayShowHomeEnabled(false); // remove the icon

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setText("Latest News");
        tabLayout.getTabAt(1).setText("Videos");
        tabLayout.getTabAt(2).setText("Photos");
        tabLayout.getTabAt(3).setText("Nenews");


    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new LatestNews(), "");
        adapter.addFragment(new Videos(), "");
        adapter.addFragment(new Photos(), "");
        adapter.addFragment(new Nenews(), "");

        viewPager.setAdapter(adapter);

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
