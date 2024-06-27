package com.bumptech.glide.test;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.instrumentation.R;

public class DefaultFragmentActivity extends FragmentActivity {
  String TAG = "DefaultFragmentActivity";

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.default_fragment_activity);
    ImageView imageView = findViewById(R.id.container);
    findViewById(R.id.show_image).setOnClickListener(v -> {
//
//          Glide.with(this)
//              .load(
//                  "https://cdn2.yicanggongyi.com/picture/08185c5f9d664cf18613e8fad5504e6f-1715673623568.png")
//              .into(imageView);

          Log.i(TAG, "onCreate: " + imageView.getScaleType());
//          Glide.with(this)
//              .load(
//                  "https://cdn.yicanggongyi.com/yinhe/icon/pc/nav/pc_logo_b.png")
//              .into(imageView);

          String urlBaidu = "https://www.baidu.com/img/bd_logo.png";
          String urlBing = "https://www.pixelstalk.net/wp-content/uploads/2016/07/1920x1080-Hd-Pictures-Download.jpg";
          Glide.with(this)
              .load(urlBing)
              .centerCrop()
              .into(imageView);

        }
    );
  }
}
