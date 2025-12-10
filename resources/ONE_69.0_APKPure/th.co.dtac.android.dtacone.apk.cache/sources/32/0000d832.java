package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class CropSquareTransformation extends BitmapTransformation {

    /* renamed from: a */
    public int f67761a;

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if ((obj instanceof CropSquareTransformation) && ((CropSquareTransformation) obj).f67761a == this.f67761a) {
            return true;
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return (-789843280) + (this.f67761a * 10);
    }

    public String toString() {
        return "CropSquareTransformation(size=" + this.f67761a + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int max = Math.max(i, i2);
        this.f67761a = max;
        return TransformationUtils.centerCrop(bitmapPool, bitmap, max, max);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.CropSquareTransformation.1" + this.f67761a).getBytes(Key.CHARSET));
    }
}