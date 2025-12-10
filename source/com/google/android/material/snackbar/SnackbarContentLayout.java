package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* renamed from: a */
    public TextView f50876a;

    /* renamed from: b */
    public Button f50877b;

    /* renamed from: c */
    public final TimeInterpolator f50878c;

    /* renamed from: d */
    public int f50879d;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static void m43977b(View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void m43978a(float f) {
        if (f != 1.0f) {
            this.f50877b.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface), this.f50877b.getCurrentTextColor(), f));
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i, int i2) {
        this.f50876a.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f50876a.animate().alpha(1.0f).setDuration(j).setInterpolator(this.f50878c).setStartDelay(j2).start();
        if (this.f50877b.getVisibility() == 0) {
            this.f50877b.setAlpha(0.0f);
            this.f50877b.animate().alpha(1.0f).setDuration(j).setInterpolator(this.f50878c).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i, int i2) {
        this.f50876a.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f50876a.animate().alpha(0.0f).setDuration(j).setInterpolator(this.f50878c).setStartDelay(j2).start();
        if (this.f50877b.getVisibility() == 0) {
            this.f50877b.setAlpha(1.0f);
            this.f50877b.animate().alpha(0.0f).setDuration(j).setInterpolator(this.f50878c).setStartDelay(j2).start();
        }
    }

    /* renamed from: c */
    public final boolean m43976c(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f50876a.getPaddingTop() == i2 && this.f50876a.getPaddingBottom() == i3) {
            return z;
        }
        m43977b(this.f50876a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f50877b;
    }

    public TextView getMessageView() {
        return this.f50876a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50876a = (TextView) findViewById(R.id.snackbar_text);
        this.f50877b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f50876a.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f50879d > 0 && this.f50877b.getMeasuredWidth() > this.f50879d) {
            if (!m43976c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m43976c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f50879d = i;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50878c = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}
