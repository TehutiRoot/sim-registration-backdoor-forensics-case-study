package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import jp.wasabeef.glide.transformations.internal.FastBlur;

/* loaded from: classes5.dex */
public class BlurTransformation extends BitmapTransformation {

    /* renamed from: c */
    public static int f67697c = 25;

    /* renamed from: d */
    public static int f67698d = 1;

    /* renamed from: a */
    public int f67699a;

    /* renamed from: b */
    public int f67700b;

    public BlurTransformation() {
        this(f67697c, f67698d);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof BlurTransformation) {
            BlurTransformation blurTransformation = (BlurTransformation) obj;
            if (blurTransformation.f67699a == this.f67699a && blurTransformation.f67700b == this.f67700b) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 737513610 + (this.f67699a * 1000) + (this.f67700b * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f67699a + ", sampling=" + this.f67700b + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f67700b;
        Bitmap bitmap2 = bitmapPool.get(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        m29061a(bitmap, bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        int i4 = this.f67700b;
        canvas.scale(1.0f / i4, 1.0f / i4);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return FastBlur.blur(bitmap2, this.f67699a, true);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f67699a + this.f67700b).getBytes(Key.CHARSET));
    }

    public BlurTransformation(int i) {
        this(i, f67698d);
    }

    public BlurTransformation(int i, int i2) {
        this.f67699a = i;
        this.f67700b = i2;
    }
}
