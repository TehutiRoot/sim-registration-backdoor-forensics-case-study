package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.InterfaceC2037Px;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class Shimmer {

    /* renamed from: a */
    public final float[] f43061a = new float[4];

    /* renamed from: b */
    public final int[] f43062b = new int[4];

    /* renamed from: c */
    public final RectF f43063c = new RectF();

    /* renamed from: d */
    public int f43064d = 0;

    /* renamed from: e */
    public int f43065e = -1;

    /* renamed from: f */
    public int f43066f = 1291845631;

    /* renamed from: g */
    public int f43067g = 0;

    /* renamed from: h */
    public int f43068h = 0;

    /* renamed from: i */
    public int f43069i = 0;

    /* renamed from: j */
    public float f43070j = 1.0f;

    /* renamed from: k */
    public float f43071k = 1.0f;

    /* renamed from: l */
    public float f43072l = 0.0f;

    /* renamed from: m */
    public float f43073m = 0.5f;

    /* renamed from: n */
    public float f43074n = 20.0f;

    /* renamed from: o */
    public boolean f43075o = true;

    /* renamed from: p */
    public boolean f43076p = true;

    /* renamed from: q */
    public boolean f43077q = true;

    /* renamed from: r */
    public int f43078r = -1;

    /* renamed from: s */
    public int f43079s = 1;

    /* renamed from: t */
    public long f43080t = 1000;

    /* renamed from: u */
    public long f43081u;

    /* loaded from: classes3.dex */
    public static class AlphaHighlightBuilder extends Builder<AlphaHighlightBuilder> {
        public AlphaHighlightBuilder() {
            this.f43082a.f43077q = true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.shimmer.Shimmer.Builder
        public AlphaHighlightBuilder getThis() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Builder<T extends Builder<T>> {

        /* renamed from: a */
        public final Shimmer f43082a = new Shimmer();

        /* renamed from: a */
        public static float m49822a(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: b */
        public Builder mo49821b(TypedArray typedArray) {
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_clip_to_children)) {
                setClipToChildren(typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_clip_to_children, this.f43082a.f43075o));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_auto_start)) {
                setAutoStart(typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_auto_start, this.f43082a.f43076p));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_base_alpha)) {
                setBaseAlpha(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                setHighlightAlpha(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_duration)) {
                setDuration(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_duration, (int) this.f43082a.f43080t));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_count)) {
                setRepeatCount(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_count, this.f43082a.f43078r));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_delay)) {
                setRepeatDelay(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.f43082a.f43081u));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_mode)) {
                setRepeatMode(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_mode, this.f43082a.f43079s));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_direction)) {
                int i = typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_direction, this.f43082a.f43064d);
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            setDirection(0);
                        } else {
                            setDirection(3);
                        }
                    } else {
                        setDirection(2);
                    }
                } else {
                    setDirection(1);
                }
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_shape)) {
                if (typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_shape, this.f43082a.f43067g) != 1) {
                    setShape(0);
                } else {
                    setShape(1);
                }
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_dropoff)) {
                setDropoff(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_dropoff, this.f43082a.f43073m));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_fixed_width)) {
                setFixedWidth(typedArray.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_shimmer_fixed_width, this.f43082a.f43068h));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_fixed_height)) {
                setFixedHeight(typedArray.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_shimmer_fixed_height, this.f43082a.f43069i));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_intensity)) {
                setIntensity(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_intensity, this.f43082a.f43072l));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_width_ratio)) {
                setWidthRatio(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_width_ratio, this.f43082a.f43070j));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_height_ratio)) {
                setHeightRatio(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_height_ratio, this.f43082a.f43071k));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_tilt)) {
                setTilt(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_tilt, this.f43082a.f43074n));
            }
            return getThis();
        }

        public Shimmer build() {
            this.f43082a.m49825b();
            this.f43082a.m49824c();
            return this.f43082a;
        }

        public T consumeAttributes(Context context, AttributeSet attributeSet) {
            return (T) mo49821b(context.obtainStyledAttributes(attributeSet, R.styleable.ShimmerFrameLayout, 0, 0));
        }

        public T copyFrom(Shimmer shimmer) {
            setDirection(shimmer.f43064d);
            setShape(shimmer.f43067g);
            setFixedWidth(shimmer.f43068h);
            setFixedHeight(shimmer.f43069i);
            setWidthRatio(shimmer.f43070j);
            setHeightRatio(shimmer.f43071k);
            setIntensity(shimmer.f43072l);
            setDropoff(shimmer.f43073m);
            setTilt(shimmer.f43074n);
            setClipToChildren(shimmer.f43075o);
            setAutoStart(shimmer.f43076p);
            setRepeatCount(shimmer.f43078r);
            setRepeatMode(shimmer.f43079s);
            setRepeatDelay(shimmer.f43081u);
            setDuration(shimmer.f43080t);
            Shimmer shimmer2 = this.f43082a;
            shimmer2.f43066f = shimmer.f43066f;
            shimmer2.f43065e = shimmer.f43065e;
            return getThis();
        }

        public abstract T getThis();

        public T setAutoStart(boolean z) {
            this.f43082a.f43076p = z;
            return getThis();
        }

        public T setBaseAlpha(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            Shimmer shimmer = this.f43082a;
            shimmer.f43066f = (((int) (m49822a(0.0f, 1.0f, f) * 255.0f)) << 24) | (shimmer.f43066f & ViewCompat.MEASURED_SIZE_MASK);
            return getThis();
        }

        public T setClipToChildren(boolean z) {
            this.f43082a.f43075o = z;
            return getThis();
        }

        public T setDirection(int i) {
            this.f43082a.f43064d = i;
            return getThis();
        }

        public T setDropoff(float f) {
            if (f >= 0.0f) {
                this.f43082a.f43073m = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        public T setDuration(long j) {
            if (j >= 0) {
                this.f43082a.f43080t = j;
                return getThis();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        public T setFixedHeight(@InterfaceC2037Px int i) {
            if (i >= 0) {
                this.f43082a.f43069i = i;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        public T setFixedWidth(@InterfaceC2037Px int i) {
            if (i >= 0) {
                this.f43082a.f43068h = i;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        public T setHeightRatio(float f) {
            if (f >= 0.0f) {
                this.f43082a.f43071k = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        public T setHighlightAlpha(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            Shimmer shimmer = this.f43082a;
            shimmer.f43065e = (((int) (m49822a(0.0f, 1.0f, f) * 255.0f)) << 24) | (shimmer.f43065e & ViewCompat.MEASURED_SIZE_MASK);
            return getThis();
        }

        public T setIntensity(float f) {
            if (f >= 0.0f) {
                this.f43082a.f43072l = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        public T setRepeatCount(int i) {
            this.f43082a.f43078r = i;
            return getThis();
        }

        public T setRepeatDelay(long j) {
            if (j >= 0) {
                this.f43082a.f43081u = j;
                return getThis();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        public T setRepeatMode(int i) {
            this.f43082a.f43079s = i;
            return getThis();
        }

        public T setShape(int i) {
            this.f43082a.f43067g = i;
            return getThis();
        }

        public T setTilt(float f) {
            this.f43082a.f43074n = f;
            return getThis();
        }

        public T setWidthRatio(float f) {
            if (f >= 0.0f) {
                this.f43082a.f43070j = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* loaded from: classes3.dex */
    public static class ColorHighlightBuilder extends Builder<ColorHighlightBuilder> {
        public ColorHighlightBuilder() {
            this.f43082a.f43077q = false;
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        /* renamed from: c */
        public ColorHighlightBuilder mo49821b(TypedArray typedArray) {
            super.mo49821b(typedArray);
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_base_color)) {
                setBaseColor(typedArray.getColor(R.styleable.ShimmerFrameLayout_shimmer_base_color, this.f43082a.f43066f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_highlight_color)) {
                setHighlightColor(typedArray.getColor(R.styleable.ShimmerFrameLayout_shimmer_highlight_color, this.f43082a.f43065e));
            }
            return getThis();
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        public ColorHighlightBuilder getThis() {
            return this;
        }

        public ColorHighlightBuilder setBaseColor(@ColorInt int i) {
            Shimmer shimmer = this.f43082a;
            shimmer.f43066f = (i & ViewCompat.MEASURED_SIZE_MASK) | (shimmer.f43066f & (-16777216));
            return getThis();
        }

        public ColorHighlightBuilder setHighlightColor(@ColorInt int i) {
            this.f43082a.f43065e = i;
            return getThis();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Direction {
        public static final int BOTTOM_TO_TOP = 3;
        public static final int LEFT_TO_RIGHT = 0;
        public static final int RIGHT_TO_LEFT = 2;
        public static final int TOP_TO_BOTTOM = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Shape {
        public static final int LINEAR = 0;
        public static final int RADIAL = 1;
    }

    /* renamed from: a */
    public int m49826a(int i) {
        int i2 = this.f43069i;
        if (i2 <= 0) {
            return Math.round(this.f43071k * i);
        }
        return i2;
    }

    /* renamed from: b */
    public void m49825b() {
        if (this.f43067g != 1) {
            int[] iArr = this.f43062b;
            int i = this.f43066f;
            iArr[0] = i;
            int i2 = this.f43065e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f43062b;
        int i3 = this.f43065e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f43066f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* renamed from: c */
    public void m49824c() {
        if (this.f43067g != 1) {
            this.f43061a[0] = Math.max(((1.0f - this.f43072l) - this.f43073m) / 2.0f, 0.0f);
            this.f43061a[1] = Math.max(((1.0f - this.f43072l) - 0.001f) / 2.0f, 0.0f);
            this.f43061a[2] = Math.min(((this.f43072l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f43061a[3] = Math.min(((this.f43072l + 1.0f) + this.f43073m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f43061a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f43072l, 1.0f);
        this.f43061a[2] = Math.min(this.f43072l + this.f43073m, 1.0f);
        this.f43061a[3] = 1.0f;
    }

    /* renamed from: d */
    public int m49823d(int i) {
        int i2 = this.f43068h;
        if (i2 <= 0) {
            return Math.round(this.f43070j * i);
        }
        return i2;
    }
}