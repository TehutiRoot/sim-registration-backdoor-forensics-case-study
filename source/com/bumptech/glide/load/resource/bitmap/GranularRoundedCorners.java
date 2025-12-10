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
    public static final byte[] f42332e = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(Key.CHARSET);

    /* renamed from: a */
    public final float f42333a;

    /* renamed from: b */
    public final float f42334b;

    /* renamed from: c */
    public final float f42335c;

    /* renamed from: d */
    public final float f42336d;

    public GranularRoundedCorners(float f, float f2, float f3, float f4) {
        this.f42333a = f;
        this.f42334b = f2;
        this.f42335c = f3;
        this.f42336d = f4;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GranularRoundedCorners)) {
            return false;
        }
        GranularRoundedCorners granularRoundedCorners = (GranularRoundedCorners) obj;
        if (this.f42333a != granularRoundedCorners.f42333a || this.f42334b != granularRoundedCorners.f42334b || this.f42335c != granularRoundedCorners.f42335c || this.f42336d != granularRoundedCorners.f42336d) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.f42336d, Util.hashCode(this.f42335c, Util.hashCode(this.f42334b, Util.hashCode(-2013597734, Util.hashCode(this.f42333a)))));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        return TransformationUtils.roundedCorners(bitmapPool, bitmap, this.f42333a, this.f42334b, this.f42335c, this.f42336d);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f42332e);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f42333a).putFloat(this.f42334b).putFloat(this.f42335c).putFloat(this.f42336d).array());
    }
}
