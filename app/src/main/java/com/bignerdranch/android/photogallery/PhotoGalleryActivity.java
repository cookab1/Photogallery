package com.bignerdranch.android.photogallery;

import android.content.Context;
import android.content.Intent;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }

    @Override
    protected PhotoGalleryFragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
