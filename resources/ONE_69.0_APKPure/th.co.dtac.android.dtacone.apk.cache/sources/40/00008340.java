package com.facebook.shimmer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.shimmer.Shimmer;

/* loaded from: classes3.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a */
    public final Paint f43090a;

    /* renamed from: b */
    public final ShimmerDrawable f43091b;

    /* renamed from: c */
    public boolean f43092c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f43090a = new Paint();
        this.f43091b = new ShimmerDrawable();
        this.f43092c = true;
        m49815a(context, null);
    }

    /* renamed from: a */
    public final void m49815a(Context context, AttributeSet attributeSet) {
        Shimmer.Builder alphaHighlightBuilder;
        setWillNotDraw(false);
        this.f43091b.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new Shimmer.AlphaHighlightBuilder().build());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShimmerFrameLayout, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_shimmer_colored) && obtainStyledAttributes.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_colored, false)) {
                alphaHighlightBuilder = new Shimmer.ColorHighlightBuilder();
            } else {
                alphaHighlightBuilder = new Shimmer.AlphaHighlightBuilder();
            }
            setShimmer(alphaHighlightBuilder.mo49821b(obtainStyledAttributes).build());
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f43092c) {
            this.f43091b.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (!this.f43092c) {
            return;
        }
        stopShimmer();
        this.f43092c = false;
        invalidate();
    }

    public boolean isShimmerStarted() {
        return this.f43091b.isShimmerStarted();
    }

    public boolean isShimmerVisible() {
        return this.f43092c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43091b.m49819a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f43091b.setBounds(0, 0, getWidth(), getHeight());
    }

    public ShimmerFrameLayout setShimmer(@Nullable Shimmer shimmer) {
        this.f43091b.setShimmer(shimmer);
        if (shimmer != null && shimmer.f43075o) {
            setLayerType(2, this.f43090a);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    public void showShimmer(boolean z) {
        if (this.f43092c) {
            return;
        }
        this.f43092c = true;
        if (z) {
            startShimmer();
        }
    }

    public void startShimmer() {
        this.f43091b.startShimmer();
    }

    public void stopShimmer() {
        this.f43091b.stopShimmer();
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f43091b) {
            return false;
        }
        return true;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43090a = new Paint();
        this.f43091b = new ShimmerDrawable();
        this.f43092c = true;
        m49815a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43090a = new Paint();
        this.f43091b = new ShimmerDrawable();
        this.f43092c = true;
        m49815a(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43090a = new Paint();
        this.f43091b = new ShimmerDrawable();
        this.f43092c = true;
        m49815a(context, attributeSet);
    }
}