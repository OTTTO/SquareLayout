package com.kaushikthedeveloper.squarelayout;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SqaureRelativeLayout extends RelativeLayout {
    public SqaureRelativeLayout(Context context) {
        super(context);
    }

    public SqaureRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SqaureRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SqaureRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * Used to temper the Layout Measurements into square before rendering
     * Based on the side having shorter length
     * @param widthMeasureSpec : original width
     * @param heightMeasureSpec : original height
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        // if height < width : call super method with heightSpec for all sides
        if (heightMeasureSpec < widthMeasureSpec) {
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
        }

        // if width <= height : call super method with widthSpec for all sides
        else {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        }
    }

}
