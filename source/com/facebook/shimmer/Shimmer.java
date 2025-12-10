package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.InterfaceC2055Px;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class Shimmer {

    /* renamed from: a */
    public final float[] f43049a = new float[4];

    /* renamed from: b */
    public final int[] f43050b = new int[4];

    /* renamed from: c */
    public final RectF f43051c = new RectF();

    /* renamed from: d */
    public int f43052d = 0;

    /* renamed from: e */
    public int f43053e = -1;

    /* renamed from: f */
    public int f43054f = 1291845631;

    /* renamed from: g */
    public int f43055g = 0;

    /* renamed from: h */
    public int f43056h = 0;

    /* renamed from: i */
    public int f43057i = 0;

    /* renamed from: j */
    public float f43058j = 1.0f;

    /* renamed from: k */
    public float f43059k = 1.0f;

    /* renamed from: l */
    public float f43060l = 0.0f;

    /* renamed from: m */
    public float f43061m = 0.5f;

    /* renamed from: n */
    public float f43062n = 20.0f;

    /* renamed from: o */
    public boolean f43063o = true;

    /* renamed from: p */
    public boolean f43064p = true;

    /* renamed from: q */
    public boolean f43065q = true;

    /* renamed from: r */
    public int f43066r = -1;

    /* renamed from: s */
    public int f43067s = 1;

    /* renamed from: t */
    public long f43068t = 1000;

    /* renamed from: u */
    public long f43069u;

    /* loaded from: classes3.dex */
    public static class AlphaHighlightBuilder extends Builder<AlphaHighlightBuilder> {
        public AlphaHighlightBuilder() {
            this.f43070a.f43065q = true;
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
        public final Shimmer f43070a = new Shimmer();

        /* renamed from: a */
        public static float m49825a(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: b */
        public Builder mo49824b(TypedArray typedArray) {
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_clip_to_children)) {
                setClipToChildren(typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_clip_to_children, this.f43070a.f43063o));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_auto_start)) {
                setAutoStart(typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_auto_start, this.f43070a.f43064p));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_base_alpha)) {
                setBaseAlpha(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                setHighlightAlpha(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_duration)) {
                setDuration(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_duration, (int) this.f43070a.f43068t));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_count)) {
                setRepeatCount(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_count, this.f43070a.f43066r));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_delay)) {
                setRepeatDelay(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.f43070a.f43069u));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_mode)) {
                setRepeatMode(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_mode, this.f43070a.f43067s));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_direction)) {
                int i = typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_direction, this.f43070a.f43052d);
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
                if (typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_shape, this.f43070a.f43055g) != 1) {
                    setShape(0);
                } else {
                    setShape(1);
                }
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_dropoff)) {
                setDropoff(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_dropoff, this.f43070a.f43061m));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_fixed_width)) {
                setFixedWidth(typedArray.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_shimmer_fixed_width, this.f43070a.f43056h));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_fixed_height)) {
                setFixedHeight(typedArray.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_shimmer_fixed_height, this.f43070a.f43057i));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_intensity)) {
                setIntensity(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_intensity, this.f43070a.f43060l));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_width_ratio)) {
                setWidthRatio(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_width_ratio, this.f43070a.f43058j));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_height_ratio)) {
                setHeightRatio(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_height_ratio, this.f43070a.f43059k));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_tilt)) {
                setTilt(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_tilt, this.f43070a.f43062n));
            }
            return getThis();
        }

        public Shimmer build() {
            this.f43070a.m49828b();
            this.f43070a.m49827c();
            return this.f43070a;
        }

        public T consumeAttributes(Context context, AttributeSet attributeSet) {
            return (T) mo49824b(context.obtainStyledAttributes(attributeSet, R.styleable.ShimmerFrameLayout, 0, 0));
        }

        public T copyFrom(Shimmer shimmer) {
            setDirection(shimmer.f43052d);
            setShape(shimmer.f43055g);
            setFixedWidth(shimmer.f43056h);
            setFixedHeight(shimmer.f43057i);
            setWidthRatio(shimmer.f43058j);
            setHeightRatio(shimmer.f43059k);
            setIntensity(shimmer.f43060l);
            setDropoff(shimmer.f43061m);
            setTilt(shimmer.f43062n);
            setClipToChildren(shimmer.f43063o);
            setAutoStart(shimmer.f43064p);
            setRepeatCount(shimmer.f43066r);
            setRepeatMode(shimmer.f43067s);
            setRepeatDelay(shimmer.f43069u);
            setDuration(shimmer.f43068t);
            Shimmer shimmer2 = this.f43070a;
            shimmer2.f43054f = shimmer.f43054f;
            shimmer2.f43053e = shimmer.f43053e;
            return getThis();
        }

        public abstract T getThis();

        public T setAutoStart(boolean z) {
            this.f43070a.f43064p = z;
            return getThis();
        }

        public T setBaseAlpha(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            Shimmer shimmer = this.f43070a;
            shimmer.f43054f = (((int) (m49825a(0.0f, 1.0f, f) * 255.0f)) << 24) | (shimmer.f43054f & ViewCompat.MEASURED_SIZE_MASK);
            return getThis();
        }

        public T setClipToChildren(boolean z) {
            this.f43070a.f43063o = z;
            return getThis();
        }

        public T setDirection(int i) {
            this.f43070a.f43052d = i;
            return getThis();
        }

        public T setDropoff(float f) {
            if (f >= 0.0f) {
                this.f43070a.f43061m = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        public T setDuration(long j) {
            if (j >= 0) {
                this.f43070a.f43068t = j;
                return getThis();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        public T setFixedHeight(@InterfaceC2055Px int i) {
            if (i >= 0) {
                this.f43070a.f43057i = i;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        public T setFixedWidth(@InterfaceC2055Px int i) {
            if (i >= 0) {
                this.f43070a.f43056h = i;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        public T setHeightRatio(float f) {
            if (f >= 0.0f) {
                this.f43070a.f43059k = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        public T setHighlightAlpha(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            Shimmer shimmer = this.f43070a;
            shimmer.f43053e = (((int) (m49825a(0.0f, 1.0f, f) * 255.0f)) << 24) | (shimmer.f43053e & ViewCompat.MEASURED_SIZE_MASK);
            return getThis();
        }

        public T setIntensity(float f) {
            if (f >= 0.0f) {
                this.f43070a.f43060l = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        public T setRepeatCount(int i) {
            this.f43070a.f43066r = i;
            return getThis();
        }

        public T setRepeatDelay(long j) {
            if (j >= 0) {
                this.f43070a.f43069u = j;
                return getThis();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        public T setRepeatMode(int i) {
            this.f43070a.f43067s = i;
            return getThis();
        }

        public T setShape(int i) {
            this.f43070a.f43055g = i;
            return getThis();
        }

        public T setTilt(float f) {
            this.f43070a.f43062n = f;
            return getThis();
        }

        public T setWidthRatio(float f) {
            if (f >= 0.0f) {
                this.f43070a.f43058j = f;
                return getThis();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* loaded from: classes3.dex */
    public static class ColorHighlightBuilder extends Builder<ColorHighlightBuilder> {
        public ColorHighlightBuilder() {
            this.f43070a.f43065q = false;
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        /* renamed from: c */
        public ColorHighlightBuilder mo49824b(TypedArray typedArray) {
            super.mo49824b(typedArray);
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_base_color)) {
                setBaseColor(typedArray.getColor(R.styleable.ShimmerFrameLayout_shimmer_base_color, this.f43070a.f43054f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_highlight_color)) {
                setHighlightColor(typedArray.getColor(R.styleable.ShimmerFrameLayout_shimmer_highlight_color, this.f43070a.f43053e));
            }
            return getThis();
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        public ColorHighlightBuilder getThis() {
            return this;
        }

        public ColorHighlightBuilder setBaseColor(@ColorInt int i) {
            Shimmer shimmer = this.f43070a;
            shimmer.f43054f = (i & ViewCompat.MEASURED_SIZE_MASK) | (shimmer.f43054f & (-16777216));
            return getThis();
        }

        public ColorHighlightBuilder setHighlightColor(@ColorInt int i) {
            this.f43070a.f43053e = i;
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
    public int m49829a(int i) {
        int i2 = this.f43057i;
        if (i2 <= 0) {
            return Math.round(this.f43059k * i);
        }
        return i2;
    }

    /* renamed from: b */
    public void m49828b() {
        if (this.f43055g != 1) {
            int[] iArr = this.f43050b;
            int i = this.f43054f;
            iArr[0] = i;
            int i2 = this.f43053e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f43050b;
        int i3 = this.f43053e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f43054f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* renamed from: c */
    public void m49827c() {
        if (this.f43055g != 1) {
            this.f43049a[0] = Math.max(((1.0f - this.f43060l) - this.f43061m) / 2.0f, 0.0f);
            this.f43049a[1] = Math.max(((1.0f - this.f43060l) - 0.001f) / 2.0f, 0.0f);
            this.f43049a[2] = Math.min(((this.f43060l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f43049a[3] = Math.min(((this.f43060l + 1.0f) + this.f43061m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f43049a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f43060l, 1.0f);
        this.f43049a[2] = Math.min(this.f43060l + this.f43061m, 1.0f);
        this.f43049a[3] = 1.0f;
    }

    /* renamed from: d */
    public int m49826d(int i) {
        int i2 = this.f43056h;
        if (i2 <= 0) {
            return Math.round(this.f43058j * i);
        }
        return i2;
    }
}
