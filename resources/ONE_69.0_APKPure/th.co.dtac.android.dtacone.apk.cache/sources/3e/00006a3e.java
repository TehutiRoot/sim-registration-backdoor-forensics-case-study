package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;

/* loaded from: classes2.dex */
public abstract class RoundedBitmapDrawable extends Drawable {

    /* renamed from: a */
    public final Bitmap f33959a;

    /* renamed from: b */
    public int f33960b;

    /* renamed from: e */
    public final BitmapShader f33963e;

    /* renamed from: g */
    public float f33965g;

    /* renamed from: k */
    public boolean f33969k;

    /* renamed from: l */
    public int f33970l;

    /* renamed from: m */
    public int f33971m;

    /* renamed from: c */
    public int f33961c = 119;

    /* renamed from: d */
    public final Paint f33962d = new Paint(3);

    /* renamed from: f */
    public final Matrix f33964f = new Matrix();

    /* renamed from: h */
    public final Rect f33966h = new Rect();

    /* renamed from: i */
    public final RectF f33967i = new RectF();

    /* renamed from: j */
    public boolean f33968j = true;

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
        this.f33960b = SyslogConstants.LOG_LOCAL4;
        if (resources != null) {
            this.f33960b = resources.getDisplayMetrics().densityDpi;
        }
        this.f33959a = bitmap;
        if (bitmap != null) {
            m57252a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f33963e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f33971m = -1;
        this.f33970l = -1;
        this.f33963e = null;
    }

    /* renamed from: c */
    public static boolean m57250c(float f) {
        return f > 0.05f;
    }

    /* renamed from: a */
    public final void m57252a() {
        this.f33970l = this.f33959a.getScaledWidth(this.f33960b);
        this.f33971m = this.f33959a.getScaledHeight(this.f33960b);
    }

    /* renamed from: b */
    public void mo57251b(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void m57249d() {
        this.f33965g = Math.min(this.f33971m, this.f33970l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f33959a;
        if (bitmap == null) {
            return;
        }
        m57248e();
        if (this.f33962d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f33966h, this.f33962d);
            return;
        }
        RectF rectF = this.f33967i;
        float f = this.f33965g;
        canvas.drawRoundRect(rectF, f, f, this.f33962d);
    }

    /* renamed from: e */
    public void m57248e() {
        if (this.f33968j) {
            if (this.f33969k) {
                int min = Math.min(this.f33970l, this.f33971m);
                mo57251b(this.f33961c, min, min, getBounds(), this.f33966h);
                int min2 = Math.min(this.f33966h.width(), this.f33966h.height());
                this.f33966h.inset(Math.max(0, (this.f33966h.width() - min2) / 2), Math.max(0, (this.f33966h.height() - min2) / 2));
                this.f33965g = min2 * 0.5f;
            } else {
                mo57251b(this.f33961c, this.f33970l, this.f33971m, getBounds(), this.f33966h);
            }
            this.f33967i.set(this.f33966h);
            if (this.f33963e != null) {
                Matrix matrix = this.f33964f;
                RectF rectF = this.f33967i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f33964f.preScale(this.f33967i.width() / this.f33959a.getWidth(), this.f33967i.height() / this.f33959a.getHeight());
                this.f33963e.setLocalMatrix(this.f33964f);
                this.f33962d.setShader(this.f33963e);
            }
            this.f33968j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f33962d.getAlpha();
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.f33959a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f33962d.getColorFilter();
    }

    public float getCornerRadius() {
        return this.f33965g;
    }

    public int getGravity() {
        return this.f33961c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f33971m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f33970l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        if (this.f33961c != 119 || this.f33969k || (bitmap = this.f33959a) == null || bitmap.hasAlpha() || this.f33962d.getAlpha() < 255 || m57250c(this.f33965g)) {
            return -3;
        }
        return -1;
    }

    @NonNull
    public final Paint getPaint() {
        return this.f33962d;
    }

    public boolean hasAntiAlias() {
        return this.f33962d.isAntiAlias();
    }

    public boolean hasMipMap() {
        throw new UnsupportedOperationException();
    }

    public boolean isCircular() {
        return this.f33969k;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f33969k) {
            m57249d();
        }
        this.f33968j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f33962d.getAlpha()) {
            this.f33962d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z) {
        this.f33962d.setAntiAlias(z);
        invalidateSelf();
    }

    public void setCircular(boolean z) {
        this.f33969k = z;
        this.f33968j = true;
        if (z) {
            m57249d();
            this.f33962d.setShader(this.f33963e);
            invalidateSelf();
            return;
        }
        setCornerRadius(0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33962d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCornerRadius(float f) {
        if (this.f33965g == f) {
            return;
        }
        this.f33969k = false;
        if (m57250c(f)) {
            this.f33962d.setShader(this.f33963e);
        } else {
            this.f33962d.setShader(null);
        }
        this.f33965g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f33962d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f33962d.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setGravity(int i) {
        if (this.f33961c != i) {
            this.f33961c = i;
            this.f33968j = true;
            invalidateSelf();
        }
    }

    public void setMipMap(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setTargetDensity(@NonNull Canvas canvas) {
        setTargetDensity(canvas.getDensity());
    }

    public void setTargetDensity(@NonNull DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i) {
        if (this.f33960b != i) {
            if (i == 0) {
                i = SyslogConstants.LOG_LOCAL4;
            }
            this.f33960b = i;
            if (this.f33959a != null) {
                m57252a();
            }
            invalidateSelf();
        }
    }
}