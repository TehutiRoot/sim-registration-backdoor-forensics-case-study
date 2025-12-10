package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mb */
/* loaded from: classes5.dex */
public final class C9585mb extends LinearLayout {
    private static int get = 1;
    private static int valueOf;
    private final ImageView ThreeDS2Service;
    private final ProgressBar ThreeDS2ServiceInstance;

    public C9585mb(Context context) {
        this(context, null);
    }

    public C9585mb ThreeDS2Service(Drawable drawable) {
        int i = valueOf;
        get = ((i & 85) + (i | 85)) % 128;
        this.ThreeDS2Service.setImageDrawable(drawable);
        this.ThreeDS2Service.setVisibility(0);
        int i2 = valueOf;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public C9585mb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9585mb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        setClickable(true);
        setFocusable(true);
        ImageView imageView = new ImageView(context);
        this.ThreeDS2Service = imageView;
        imageView.setVisibility(8);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C9624nm.valueOf(120), -2);
        layoutParams.topMargin = C9624nm.valueOf(C9375et.ThreeDS2ServiceInstance);
        imageView.setLayoutParams(layoutParams);
        ProgressBar progressBar = new ProgressBar(context, null, 16842874);
        this.ThreeDS2ServiceInstance = progressBar;
        progressBar.setLayoutParams(new ViewGroup.LayoutParams(C9624nm.valueOf(48), C9624nm.valueOf(48)));
        addView(progressBar);
        addView(imageView);
    }

    public C9585mb ThreeDS2Service(String str) {
        valueOf = (get + 27) % 128;
        setBackgroundColor(C9606mw.ThreeDS2Service(197, str));
        int i = valueOf;
        get = ((i ^ 121) + ((i & 121) << 1)) % 128;
        return this;
    }
}
