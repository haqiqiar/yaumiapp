package id.its.yaumirev_1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class ChartMainFragment extends Fragment {
    private FragmentTabHost mTabHost;
    private FragmentActivity faActivity;
    private FragmentTabHost llLayout;


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        faActivity = (FragmentActivity) super.getActivity();
        llLayout    = (FragmentTabHost) inflater.inflate(R.layout.fragment_chart_main, container, false);

        mTabHost = (FragmentTabHost) llLayout.findViewById(android.R.id.tabhost);
        mTabHost.setup(this.getContext(), getChildFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(
                mTabHost.newTabSpec("Chart1").setIndicator("Chart 1", null),
                ChartProgressFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Tab 3", null),
                ChartProgressFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("Detail Progress").setIndicator("Detail", null),
                DetailedProgressFragment.class, null);
        return llLayout;
    }
}
