package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.security.MessageDigest;
import jp.wasabeef.glide.transformations.internal.Utils;

/* loaded from: classes5.dex */
public class CropCircleWithBorderTransformation extends BitmapTransformation {

    /* renamed from: a */
    public int f67759a;

    /* renamed from: b */
    public int f67760b;

    public CropCircleWithBorderTransformation() {
        this.f67759a = Utils.toDp(4);
        this.f67760b = -16777216;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof CropCircleWithBorderTransformation) {
            CropCircleWithBorderTransformation cropCircleWithBorderTransformation = (CropCircleWithBorderTransformation) obj;
            if (cropCircleWithBorderTransformation.f67759a == this.f67759a && cropCircleWithBorderTransformation.f67760b == this.f67760b) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 882652245 + (this.f67759a * 100) + this.f67760b + 10;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        Bitmap circleCrop = TransformationUtils.circleCrop(bitmapPool, bitmap, i, i2);
        m29358a(bitmap, circleCrop);
        Paint paint = new Paint();
        paint.setColor(this.f67760b);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f67759a);
        paint.setAntiAlias(true);
        new Canvas(circleCrop).drawCircle(i / 2.0f, i2 / 2.0f, (Math.max(i, i2) / 2.0f) - (this.f67759a / 2.0f), paint);
        return circleCrop;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.CropCircleWithBorderTransformation.1" + this.f67759a + this.f67760b).getBytes(Key.CHARSET));
    }

    public CropCircleWithBorderTransformation(int i, @ColorInt int i2) {
        this.f67759a = i;
        this.f67760b = i2;
    }
}