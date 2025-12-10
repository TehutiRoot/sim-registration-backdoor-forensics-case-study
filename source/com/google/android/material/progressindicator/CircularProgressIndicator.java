package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f50426a).indicatorDirection;
    }

    @InterfaceC2055Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f50426a).indicatorInset;
    }

    @InterfaceC2055Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f50426a).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: p */
    public CircularProgressIndicatorSpec mo44420h(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: q */
    public final void m44434q() {
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.f50426a));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.f50426a));
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f50426a).indicatorDirection = i;
        invalidate();
    }

    public void setIndicatorInset(@InterfaceC2055Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50426a;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset != i) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@InterfaceC2055Px int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50426a;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize != max) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize = max;
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).mo44417c();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f50426a).mo44417c();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        m44434q();
    }
}
