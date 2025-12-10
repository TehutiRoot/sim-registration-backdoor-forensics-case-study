package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class CropTransformation extends BitmapTransformation {

    /* renamed from: a */
    public int f67762a;

    /* renamed from: b */
    public int f67763b;

    /* renamed from: c */
    public CropType f67764c;

    /* loaded from: classes5.dex */
    public enum CropType {
        TOP,
        CENTER,
        BOTTOM
    }

    /* renamed from: jp.wasabeef.glide.transformations.CropTransformation$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11586a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67765a;

        static {
            int[] iArr = new int[CropType.values().length];
            f67765a = iArr;
            try {
                iArr[CropType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67765a[CropType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67765a[CropType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CropTransformation(int i, int i2) {
        this(i, i2, CropType.CENTER);
    }

    /* renamed from: b */
    public final float m29357b(float f) {
        int i = C11586a.f67765a[this.f67764c.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return 0.0f;
            }
            return this.f67763b - f;
        }
        return (this.f67763b - f) / 2.0f;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof CropTransformation) {
            CropTransformation cropTransformation = (CropTransformation) obj;
            if (cropTransformation.f67762a == this.f67762a && cropTransformation.f67763b == this.f67763b && cropTransformation.f67764c == this.f67764c) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return (-1462327117) + (this.f67762a * AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength) + (this.f67763b * 1000) + (this.f67764c.ordinal() * 10);
    }

    public String toString() {
        return "CropTransformation(width=" + this.f67762a + ", height=" + this.f67763b + ", cropType=" + this.f67764c + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int i3 = this.f67762a;
        if (i3 == 0) {
            i3 = bitmap.getWidth();
        }
        this.f67762a = i3;
        int i4 = this.f67763b;
        if (i4 == 0) {
            i4 = bitmap.getHeight();
        }
        this.f67763b = i4;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap2 = bitmapPool.get(this.f67762a, this.f67763b, config);
        bitmap2.setHasAlpha(true);
        float max = Math.max(this.f67762a / bitmap.getWidth(), this.f67763b / bitmap.getHeight());
        float width = bitmap.getWidth() * max;
        float height = max * bitmap.getHeight();
        float f = (this.f67762a - width) / 2.0f;
        float m29357b = m29357b(height);
        RectF rectF = new RectF(f, m29357b, width + f, height + m29357b);
        m29358a(bitmap, bitmap2);
        new Canvas(bitmap2).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return bitmap2;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.CropTransformation.1" + this.f67762a + this.f67763b + this.f67764c).getBytes(Key.CHARSET));
    }

    public CropTransformation(int i, int i2, CropType cropType) {
        CropType cropType2 = CropType.TOP;
        this.f67762a = i;
        this.f67763b = i2;
        this.f67764c = cropType;
    }
}