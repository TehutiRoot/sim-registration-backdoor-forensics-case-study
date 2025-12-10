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
    public static int f67754c = 25;

    /* renamed from: d */
    public static int f67755d = 1;

    /* renamed from: a */
    public int f67756a;

    /* renamed from: b */
    public int f67757b;

    public BlurTransformation() {
        this(f67754c, f67755d);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof BlurTransformation) {
            BlurTransformation blurTransformation = (BlurTransformation) obj;
            if (blurTransformation.f67756a == this.f67756a && blurTransformation.f67757b == this.f67757b) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 737513610 + (this.f67756a * 1000) + (this.f67757b * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f67756a + ", sampling=" + this.f67757b + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f67757b;
        Bitmap bitmap2 = bitmapPool.get(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        m29358a(bitmap, bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        int i4 = this.f67757b;
        canvas.scale(1.0f / i4, 1.0f / i4);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return FastBlur.blur(bitmap2, this.f67756a, true);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f67756a + this.f67757b).getBytes(Key.CHARSET));
    }

    public BlurTransformation(int i) {
        this(i, f67755d);
    }

    public BlurTransformation(int i, int i2) {
        this.f67756a = i;
        this.f67757b = i2;
    }
}