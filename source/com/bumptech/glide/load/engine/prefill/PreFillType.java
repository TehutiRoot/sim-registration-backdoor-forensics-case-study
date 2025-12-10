package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes3.dex */
public final class PreFillType {

    /* renamed from: e */
    public static final Bitmap.Config f42153e = Bitmap.Config.RGB_565;

    /* renamed from: a */
    public final int f42154a;

    /* renamed from: b */
    public final int f42155b;

    /* renamed from: c */
    public final Bitmap.Config f42156c;

    /* renamed from: d */
    public final int f42157d;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public final int f42158a;

        /* renamed from: b */
        public final int f42159b;

        /* renamed from: c */
        public Bitmap.Config f42160c;

        /* renamed from: d */
        public int f42161d;

        public Builder(int i) {
            this(i, i);
        }

        /* renamed from: a */
        public PreFillType m50312a() {
            return new PreFillType(this.f42158a, this.f42159b, this.f42160c, this.f42161d);
        }

        /* renamed from: b */
        public Bitmap.Config m50311b() {
            return this.f42160c;
        }

        public Builder setConfig(@Nullable Bitmap.Config config) {
            this.f42160c = config;
            return this;
        }

        public Builder setWeight(int i) {
            if (i > 0) {
                this.f42161d = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public Builder(int i, int i2) {
            this.f42161d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i2 > 0) {
                this.f42158a = i;
                this.f42159b = i2;
                return;
            }
            throw new IllegalArgumentException("Height must be > 0");
        }
    }

    public PreFillType(int i, int i2, Bitmap.Config config, int i3) {
        this.f42156c = (Bitmap.Config) Preconditions.checkNotNull(config, "Config must not be null");
        this.f42154a = i;
        this.f42155b = i2;
        this.f42157d = i3;
    }

    /* renamed from: a */
    public Bitmap.Config m50316a() {
        return this.f42156c;
    }

    /* renamed from: b */
    public int m50315b() {
        return this.f42155b;
    }

    /* renamed from: c */
    public int m50314c() {
        return this.f42157d;
    }

    /* renamed from: d */
    public int m50313d() {
        return this.f42154a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PreFillType)) {
            return false;
        }
        PreFillType preFillType = (PreFillType) obj;
        if (this.f42155b != preFillType.f42155b || this.f42154a != preFillType.f42154a || this.f42157d != preFillType.f42157d || this.f42156c != preFillType.f42156c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f42154a * 31) + this.f42155b) * 31) + this.f42156c.hashCode()) * 31) + this.f42157d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f42154a + ", height=" + this.f42155b + ", config=" + this.f42156c + ", weight=" + this.f42157d + '}';
    }
}
