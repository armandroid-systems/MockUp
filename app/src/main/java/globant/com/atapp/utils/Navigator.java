package globant.com.atapp.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import globant.com.atapp.R;

/**
 * Created by armando.dominguez on 23/09/2015.
 */
public class Navigator {

    public static void screenChange(FragmentActivity origin, Class fragment, Object param, String id) throws IllegalAccessException, InstantiationException {

        FragmentTransaction transaction = origin.getSupportFragmentManager().beginTransaction();
        transaction.addToBackStack(id);
        Fragment mFragment = (Fragment)fragment.newInstance();
        if(param != null){
            Bundle paramWrapper = new Bundle();
            paramWrapper.putParcelable(Constants.KEY_PARAMS, (Parcelable)param);
            mFragment.setArguments(paramWrapper);
        }
        transaction.addToBackStack(id);
        transaction.replace(R.id.fragment_wrapper,mFragment);
        transaction.commit();
    }

}
