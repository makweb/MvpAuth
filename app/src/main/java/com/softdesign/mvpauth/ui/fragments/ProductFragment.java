package com.softdesign.mvpauth.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softdesign.mvpauth.mvp.presenters.ProductPresenter;
import com.softdesign.mvpauth.mvp.views.IProductView;

/**
 * Created by Makweb on 21.10.2016.
 */

public class ProductFragment extends Fragment implements IProductView {
    ProductPresenter mProductPresenter = ProductPresenter.getInstance();

    private String name;
    private int age;

    public static ProductFragment newInstance(String name, int age) {
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        bundle.putInt("age", age);

        ProductFragment fragment = new ProductFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            name = bundle.getString("name");
            age = bundle.getInt("age");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.fragment_sample, container, false);
       /* mNameTextView = (TextView) view.findViewById(R.id.nameTextView);
        mAgeTextView = (TextView) view.findViewById(R.id.ageTextView);*/

        readBundle(getArguments());

      /*  mNameTextView.setText(String.format("Name: %s", name));
        mAgeTextView.setText(String.format("Age: %d", age));
*/
       // return view;
        return null;
    }
    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable e) {

    }

    @Override
    public void showLoad() {

    }

    @Override
    public void hideLoad() {

    }
}
