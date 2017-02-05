# TabLayout简单的使用 Tablayout 和 ViewPager 创建底部导航栏

<android.support.v4.view.ViewPager
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:id="@+id/view_pager"
        android:layout_weight="1">
    </android.support.v4.view.ViewPager>

    <android.support.design.widget.TabLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/tab"
        app:tabBackground="@color/tab_background"
        app:tabMode="fixed"
        style="@style/MyCustomTabLayout">
    </android.support.design.widget.TabLayout>
    
     private void initView() {
        String[] tabTitle = getResources().getStringArray(R.array.tab_titles);
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new BlankFragment1());
        fragmentList.add(new BlankFragment2());
        fragmentList.add(new BlankFragment3());
        fragmentList.add(new BlankFragment4());
        fragmentList.add(new BlankFragment5());
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, tabTitle));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            Drawable d = null;
            switch (i) {
                case 0:
                    d = getResources().getDrawable(R.drawable.tab1);
                    break;
                case 1:
                    d = getResources().getDrawable(R.drawable.tab1);
                    break;
                case 2:
                    d = getResources().getDrawable(R.drawable.tab1);
                    break;
                case 3:
                    d = getResources().getDrawable(R.drawable.tab1);
                    break;
                case 4:
                    d = getResources().getDrawable(R.drawable.tab1);
                    break;
            }
            tab.setIcon(d);
        }

    }
    
      private List<Fragment> fragmentList;
    private String[] titles;


    public MyFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragmentList, String[] titles) {
        super(fragmentManager);
        this.fragmentList = fragmentList;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
