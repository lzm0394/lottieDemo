package com.lzm.lottiedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.lzm.lottiedemo.viewcustom.LottieFontViewGroup;

public class Main2Activity extends AppCompatActivity {

    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {

        @Override
        public void onGlobalLayout() {

            scrollView.fullScroll(ScrollView.FOCUS_DOWN);
        }
    };
    private ScrollView scrollView;
    private LottieFontViewGroup lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        scrollView = (ScrollView) findViewById(R.id.scroll_view);
        lottieAnimationView = (LottieFontViewGroup) findViewById(R.id.font_view);

        lottieAnimationView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lottieAnimationView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
