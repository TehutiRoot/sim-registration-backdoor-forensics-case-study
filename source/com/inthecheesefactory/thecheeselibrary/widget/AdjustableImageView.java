package com.inthecheesefactory.thecheeselibrary.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public class AdjustableImageView extends ImageView {

    /* renamed from: a */
    public boolean f58016a;

    public AdjustableImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean m33869a() {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onMeasure(i, i2);
        } else if (this.f58016a) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int i3 = (intrinsicWidth * size) / intrinsicHeight;
                if (m33869a()) {
                    setMeasuredDimension(i3, size);
                } else {
                    setMeasuredDimension(Math.min(i3, size2), Math.min(size, size));
                }
            } else if (mode2 == 1073741824 && mode != 1073741824) {
                int i4 = (intrinsicHeight * size2) / intrinsicWidth;
                if (m33869a()) {
                    setMeasuredDimension(size2, i4);
                } else {
                    setMeasuredDimension(Math.min(size2, size2), Math.min(i4, size));
                }
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        this.f58016a = z;
        super.setAdjustViewBounds(z);
    }

    public AdjustableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdjustableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
