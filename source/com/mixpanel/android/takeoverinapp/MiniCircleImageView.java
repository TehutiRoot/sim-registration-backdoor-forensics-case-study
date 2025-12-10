package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public class MiniCircleImageView extends ImageView {

    /* renamed from: a */
    public Paint f58734a;

    /* renamed from: b */
    public int f58735b;

    /* renamed from: c */
    public int f58736c;

    public MiniCircleImageView(Context context) {
        super(context);
        m33474a();
    }

    /* renamed from: a */
    public final void m33474a() {
        int color;
        Paint paint = new Paint(1);
        this.f58734a = paint;
        if (Build.VERSION.SDK_INT >= 23) {
            color = getResources().getColor(17170443, null);
            paint.setColor(color);
        } else {
            paint.setColor(getResources().getColor(17170443));
        }
        this.f58734a.setStyle(Paint.Style.STROKE);
        this.f58734a.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f58735b = i;
        this.f58736c = i2;
    }

    public MiniCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33474a();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m33474a();
    }
}
