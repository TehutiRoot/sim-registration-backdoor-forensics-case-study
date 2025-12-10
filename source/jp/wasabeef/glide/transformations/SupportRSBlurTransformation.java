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
import jp.wasabeef.glide.transformations.internal.RSBlur;
import jp.wasabeef.glide.transformations.internal.SupportRSBlur;

/* loaded from: classes5.dex */
public class SupportRSBlurTransformation extends BitmapTransformation {

    /* renamed from: c */
    public static int f67716c = 25;

    /* renamed from: d */
    public static int f67717d = 1;

    /* renamed from: a */
    public int f67718a;

    /* renamed from: b */
    public int f67719b;

    public SupportRSBlurTransformation() {
        this(f67716c, f67717d);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof SupportRSBlurTransformation) {
            SupportRSBlurTransformation supportRSBlurTransformation = (SupportRSBlurTransformation) obj;
            if (supportRSBlurTransformation.f67718a == this.f67718a && supportRSBlurTransformation.f67719b == this.f67719b) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 1842095596 + (this.f67718a * 1000) + (this.f67719b * 10);
    }

    public String toString() {
        return "SupportRSBlurTransformation(radius=" + this.f67718a + ", sampling=" + this.f67719b + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f67719b;
        Bitmap bitmap2 = bitmapPool.get(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        m29061a(bitmap, bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        int i4 = this.f67719b;
        canvas.scale(1.0f / i4, 1.0f / i4);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return SupportRSBlur.blur(context, bitmap2, this.f67718a);
        } catch (NoClassDefFoundError unused) {
            return RSBlur.blur(context, bitmap2, this.f67718a);
        } catch (RuntimeException unused2) {
            return FastBlur.blur(bitmap2, this.f67718a, true);
        }
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.SupportRSBlurTransformation.1" + this.f67718a + this.f67719b).getBytes(Key.CHARSET));
    }

    public SupportRSBlurTransformation(int i) {
        this(i, f67717d);
    }

    public SupportRSBlurTransformation(int i, int i2) {
        this.f67718a = i;
        this.f67719b = i2;
    }
}
