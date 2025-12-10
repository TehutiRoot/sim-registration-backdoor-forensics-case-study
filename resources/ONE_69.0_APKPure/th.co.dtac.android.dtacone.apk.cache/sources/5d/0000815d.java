package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class GranularRoundedCorners extends BitmapTransformation {

    /* renamed from: e */
    public static final byte[] f42344e = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(Key.CHARSET);

    /* renamed from: a */
    public final float f42345a;

    /* renamed from: b */
    public final float f42346b;

    /* renamed from: c */
    public final float f42347c;

    /* renamed from: d */
    public final float f42348d;

    public GranularRoundedCorners(float f, float f2, float f3, float f4) {
        this.f42345a = f;
        this.f42346b = f2;
        this.f42347c = f3;
        this.f42348d = f4;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GranularRoundedCorners)) {
            return false;
        }
        GranularRoundedCorners granularRoundedCorners = (GranularRoundedCorners) obj;
        if (this.f42345a != granularRoundedCorners.f42345a || this.f42346b != granularRoundedCorners.f42346b || this.f42347c != granularRoundedCorners.f42347c || this.f42348d != granularRoundedCorners.f42348d) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.f42348d, Util.hashCode(this.f42347c, Util.hashCode(this.f42346b, Util.hashCode(-2013597734, Util.hashCode(this.f42345a)))));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        return TransformationUtils.roundedCorners(bitmapPool, bitmap, this.f42345a, this.f42346b, this.f42347c, this.f42348d);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f42344e);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f42345a).putFloat(this.f42346b).putFloat(this.f42347c).putFloat(this.f42348d).array());
    }
}