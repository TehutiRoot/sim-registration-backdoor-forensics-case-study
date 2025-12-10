package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes3.dex */
public final class PreFillType {

    /* renamed from: e */
    public static final Bitmap.Config f42165e = Bitmap.Config.RGB_565;

    /* renamed from: a */
    public final int f42166a;

    /* renamed from: b */
    public final int f42167b;

    /* renamed from: c */
    public final Bitmap.Config f42168c;

    /* renamed from: d */
    public final int f42169d;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public final int f42170a;

        /* renamed from: b */
        public final int f42171b;

        /* renamed from: c */
        public Bitmap.Config f42172c;

        /* renamed from: d */
        public int f42173d;

        public Builder(int i) {
            this(i, i);
        }

        /* renamed from: a */
        public PreFillType m50309a() {
            return new PreFillType(this.f42170a, this.f42171b, this.f42172c, this.f42173d);
        }

        /* renamed from: b */
        public Bitmap.Config m50308b() {
            return this.f42172c;
        }

        public Builder setConfig(@Nullable Bitmap.Config config) {
            this.f42172c = config;
            return this;
        }

        public Builder setWeight(int i) {
            if (i > 0) {
                this.f42173d = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public Builder(int i, int i2) {
            this.f42173d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i2 > 0) {
                this.f42170a = i;
                this.f42171b = i2;
                return;
            }
            throw new IllegalArgumentException("Height must be > 0");
        }
    }

    public PreFillType(int i, int i2, Bitmap.Config config, int i3) {
        this.f42168c = (Bitmap.Config) Preconditions.checkNotNull(config, "Config must not be null");
        this.f42166a = i;
        this.f42167b = i2;
        this.f42169d = i3;
    }

    /* renamed from: a */
    public Bitmap.Config m50313a() {
        return this.f42168c;
    }

    /* renamed from: b */
    public int m50312b() {
        return this.f42167b;
    }

    /* renamed from: c */
    public int m50311c() {
        return this.f42169d;
    }

    /* renamed from: d */
    public int m50310d() {
        return this.f42166a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PreFillType)) {
            return false;
        }
        PreFillType preFillType = (PreFillType) obj;
        if (this.f42167b != preFillType.f42167b || this.f42166a != preFillType.f42166a || this.f42169d != preFillType.f42169d || this.f42168c != preFillType.f42168c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f42166a * 31) + this.f42167b) * 31) + this.f42168c.hashCode()) * 31) + this.f42169d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f42166a + ", height=" + this.f42167b + ", config=" + this.f42168c + ", weight=" + this.f42169d + '}';
    }
}