package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class RoundedCornersTransformation extends BitmapTransformation {

    /* renamed from: a */
    public int f67711a;

    /* renamed from: b */
    public int f67712b;

    /* renamed from: c */
    public int f67713c;

    /* renamed from: d */
    public CornerType f67714d;

    /* loaded from: classes5.dex */
    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    /* renamed from: jp.wasabeef.glide.transformations.RoundedCornersTransformation$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11603a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67715a;

        static {
            int[] iArr = new int[CornerType.values().length];
            f67715a = iArr;
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67715a[CornerType.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67715a[CornerType.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67715a[CornerType.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67715a[CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67715a[CornerType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67715a[CornerType.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67715a[CornerType.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67715a[CornerType.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67715a[CornerType.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f67715a[CornerType.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f67715a[CornerType.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f67715a[CornerType.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f67715a[CornerType.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f67715a[CornerType.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public RoundedCornersTransformation(int i, int i2) {
        this(i, i2, CornerType.ALL);
    }

    /* renamed from: b */
    public final void m29059b(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        int i2 = this.f67712b;
        RectF rectF = new RectF(i, f2 - i2, i + i2, f2);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f67713c;
        canvas.drawRect(new RectF(i4, i4, i4 + this.f67712b, f2 - this.f67711a), paint);
        int i5 = this.f67713c;
        canvas.drawRect(new RectF(this.f67711a + i5, i5, f, f2), paint);
    }

    /* renamed from: c */
    public final void m29058c(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67712b;
        RectF rectF = new RectF(f - i, f2 - i, f, f2);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f67713c;
        canvas.drawRect(new RectF(i3, i3, f - this.f67711a, f2), paint);
        int i4 = this.f67711a;
        canvas.drawRect(new RectF(f - i4, this.f67713c, f, f2 - i4), paint);
    }

    /* renamed from: d */
    public final void m29057d(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.f67713c, f2 - this.f67712b, f, f2);
        int i = this.f67711a;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.f67713c;
        canvas.drawRect(new RectF(i2, i2, f, f2 - this.f67711a), paint);
    }

    /* renamed from: e */
    public final void m29056e(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        int i2 = this.f67712b;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f67712b;
        RectF rectF2 = new RectF(f - i4, f2 - i4, f, f2);
        int i5 = this.f67711a;
        canvas.drawRoundRect(rectF2, i5, i5, paint);
        int i6 = this.f67713c;
        canvas.drawRect(new RectF(i6, i6 + this.f67711a, f - this.f67712b, f2), paint);
        int i7 = this.f67713c;
        canvas.drawRect(new RectF(this.f67712b + i7, i7, f, f2 - this.f67711a), paint);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            if (roundedCornersTransformation.f67711a == this.f67711a && roundedCornersTransformation.f67712b == this.f67712b && roundedCornersTransformation.f67713c == this.f67713c && roundedCornersTransformation.f67714d == this.f67714d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m29055f(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67712b;
        int i2 = this.f67713c;
        RectF rectF = new RectF(f - i, i2, f, i2 + i);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f67713c;
        int i5 = this.f67712b;
        RectF rectF2 = new RectF(i4, f2 - i5, i4 + i5, f2);
        int i6 = this.f67711a;
        canvas.drawRoundRect(rectF2, i6, i6, paint);
        int i7 = this.f67713c;
        int i8 = this.f67711a;
        canvas.drawRect(new RectF(i7, i7, f - i8, f2 - i8), paint);
        int i9 = this.f67713c;
        int i10 = this.f67711a;
        canvas.drawRect(new RectF(i9 + i10, i9 + i10, f, f2), paint);
    }

    /* renamed from: g */
    public final void m29054g(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        RectF rectF = new RectF(i, i, i + this.f67712b, f2);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f67713c;
        canvas.drawRect(new RectF(this.f67711a + i3, i3, f, f2), paint);
    }

    /* renamed from: h */
    public final void m29053h(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        RectF rectF = new RectF(i, i, f, i + this.f67712b);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(f - this.f67712b, this.f67713c, f, f2);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.f67713c;
        int i5 = this.f67711a;
        canvas.drawRect(new RectF(i4, i4 + i5, f - i5, f2), paint);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 425235636 + (this.f67711a * 10000) + (this.f67712b * 1000) + (this.f67713c * 100) + (this.f67714d.ordinal() * 10);
    }

    /* renamed from: i */
    public final void m29052i(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        RectF rectF = new RectF(i, i, f, i + this.f67712b);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f67713c;
        RectF rectF2 = new RectF(i3, i3, i3 + this.f67712b, f2);
        int i4 = this.f67711a;
        canvas.drawRoundRect(rectF2, i4, i4, paint);
        int i5 = this.f67713c;
        int i6 = this.f67711a;
        canvas.drawRect(new RectF(i5 + i6, i5 + i6, f, f2), paint);
    }

    /* renamed from: j */
    public final void m29051j(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.f67713c, f2 - this.f67712b, f, f2);
        int i = this.f67711a;
        canvas.drawRoundRect(rectF, i, i, paint);
        RectF rectF2 = new RectF(f - this.f67712b, this.f67713c, f, f2);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF2, i2, i2, paint);
        int i3 = this.f67713c;
        int i4 = this.f67711a;
        canvas.drawRect(new RectF(i3, i3, f - i4, f2 - i4), paint);
    }

    /* renamed from: k */
    public final void m29050k(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        RectF rectF = new RectF(i, i, i + this.f67712b, f2);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(this.f67713c, f2 - this.f67712b, f, f2);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.f67713c;
        int i5 = this.f67711a;
        canvas.drawRect(new RectF(i4 + i5, i4, f, f2 - i5), paint);
    }

    /* renamed from: l */
    public final void m29049l(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - this.f67712b, this.f67713c, f, f2);
        int i = this.f67711a;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.f67713c;
        canvas.drawRect(new RectF(i2, i2, f - this.f67711a, f2), paint);
    }

    /* renamed from: m */
    public final void m29048m(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        float f3 = f - i;
        float f4 = f2 - i;
        switch (C11603a.f67715a[this.f67714d.ordinal()]) {
            case 1:
                int i2 = this.f67713c;
                RectF rectF = new RectF(i2, i2, f3, f4);
                int i3 = this.f67711a;
                canvas.drawRoundRect(rectF, i3, i3, paint);
                return;
            case 2:
                m29047n(canvas, paint, f3, f4);
                return;
            case 3:
                m29046o(canvas, paint, f3, f4);
                return;
            case 4:
                m29059b(canvas, paint, f3, f4);
                return;
            case 5:
                m29058c(canvas, paint, f3, f4);
                return;
            case 6:
                m29045p(canvas, paint, f3, f4);
                return;
            case 7:
                m29057d(canvas, paint, f3, f4);
                return;
            case 8:
                m29054g(canvas, paint, f3, f4);
                return;
            case 9:
                m29049l(canvas, paint, f3, f4);
                return;
            case 10:
                m29051j(canvas, paint, f3, f4);
                return;
            case 11:
                m29050k(canvas, paint, f3, f4);
                return;
            case 12:
                m29053h(canvas, paint, f3, f4);
                return;
            case 13:
                m29052i(canvas, paint, f3, f4);
                return;
            case 14:
                m29056e(canvas, paint, f3, f4);
                return;
            case 15:
                m29055f(canvas, paint, f3, f4);
                return;
            default:
                int i4 = this.f67713c;
                RectF rectF2 = new RectF(i4, i4, f3, f4);
                int i5 = this.f67711a;
                canvas.drawRoundRect(rectF2, i5, i5, paint);
                return;
        }
    }

    /* renamed from: n */
    public final void m29047n(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        int i2 = this.f67712b;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f67713c;
        int i5 = this.f67711a;
        canvas.drawRect(new RectF(i4, i4 + i5, i4 + i5, f2), paint);
        int i6 = this.f67713c;
        canvas.drawRect(new RectF(this.f67711a + i6, i6, f, f2), paint);
    }

    /* renamed from: o */
    public final void m29046o(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67712b;
        int i2 = this.f67713c;
        RectF rectF = new RectF(f - i, i2, f, i2 + i);
        int i3 = this.f67711a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f67713c;
        canvas.drawRect(new RectF(i4, i4, f - this.f67711a, f2), paint);
        int i5 = this.f67711a;
        canvas.drawRect(new RectF(f - i5, this.f67713c + i5, f, f2), paint);
    }

    /* renamed from: p */
    public final void m29045p(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f67713c;
        RectF rectF = new RectF(i, i, f, i + this.f67712b);
        int i2 = this.f67711a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f67713c;
        canvas.drawRect(new RectF(i3, i3 + this.f67711a, f, f2), paint);
    }

    public String toString() {
        return "RoundedTransformation(radius=" + this.f67711a + ", margin=" + this.f67713c + ", diameter=" + this.f67712b + ", cornerType=" + this.f67714d.name() + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = bitmapPool.get(width, height, Bitmap.Config.ARGB_8888);
        bitmap2.setHasAlpha(true);
        m29061a(bitmap, bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        m29048m(canvas, paint, width, height);
        return bitmap2;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.RoundedCornersTransformation.1" + this.f67711a + this.f67712b + this.f67713c + this.f67714d).getBytes(Key.CHARSET));
    }

    public RoundedCornersTransformation(int i, int i2, CornerType cornerType) {
        this.f67711a = i;
        this.f67712b = i * 2;
        this.f67713c = i2;
        this.f67714d = cornerType;
    }
}
