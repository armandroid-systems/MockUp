package globant.com.atapp.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import globant.com.atapp.R;

/**
 * Created by armando.dominguez on 23/09/2015.
 */
public class FragmentSearch extends Fragment {
    private final static String TAG = FragmentSearch.class.getSimpleName();

    private RecyclerView dummyDevices;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View searchView = inflater.inflate(R.layout.fragment_search_device,container,false);

        dummyDevices = (RecyclerView) searchView.findViewById(R.id.recycler_devices);

        return searchView;
    }
}
