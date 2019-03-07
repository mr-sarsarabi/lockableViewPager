package com.mr_sarsarabi.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

/**
 * This Class provides A feature to lock the ViewPager
 * Whether in Java : setSwipeLocked(true)
 * Or in Xml: lock_swipe = "true"
 */
public class LockableViewPager extends ViewPager {

    private boolean swipeLocked;

    public LockableViewPager(Context context) {
        super(context);
    }

    public LockableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

        // the code below is for initializing swipeLocked from xml
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LockableViewPager);
        try {
            swipeLocked = a.getBoolean(R.styleable.LockableViewPager_lock_swipe, false);
        } finally {
            a.recycle();
        }
    }

    public boolean getSwipeLocked() {
        return swipeLocked;
    }

    public void setSwipeLocked(boolean swipeLocked) {
        this.swipeLocked = swipeLocked;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return !swipeLocked && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return !swipeLocked && super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return !swipeLocked && super.canScrollHorizontally(direction);
    }

}