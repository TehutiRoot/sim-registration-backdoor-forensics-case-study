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
    public final Bitmap f33871a;

    /* renamed from: b */
    public int f33872b;

    /* renamed from: e */
    public final BitmapShader f33875e;

    /* renamed from: g */
    public float f33877g;

    /* renamed from: k */
    public boolean f33881k;

    /* renamed from: l */
    public int f33882l;

    /* renamed from: m */
    public int f33883m;

    /* renamed from: c */
    public int f33873c = 119;

    /* renamed from: d */
    public final Paint f33874d = new Paint(3);

    /* renamed from: f */
    public final Matrix f33876f = new Matrix();

    /* renamed from: h */
    public final Rect f33878h = new Rect();

    /* renamed from: i */
    public final RectF f33879i = new RectF();

    /* renamed from: j */
    public boolean f33880j = true;

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
        this.f33872b = SyslogConstants.LOG_LOCAL4;
        if (resources != null) {
            this.f33872b = resources.getDisplayMetrics().densityDpi;
        }
        this.f33871a = bitmap;
        if (bitmap != null) {
            m57302a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f33875e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f33883m = -1;
        this.f33882l = -1;
        this.f33875e = null;
    }

    /* renamed from: c */
    public static boolean m57300c(float f) {
        return f > 0.05f;
    }

    /* renamed from: a */
    public final void m57302a() {
        this.f33882l = this.f33871a.getScaledWidth(this.f33872b);
        this.f33883m = this.f33871a.getScaledHeight(this.f33872b);
    }

    /* renamed from: b */
    public void mo57301b(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void m57299d() {
        this.f33877g = Math.min(this.f33883m, this.f33882l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f33871a;
        if (bitmap == null) {
            return;
        }
        m57298e();
        if (this.f33874d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f33878h, this.f33874d);
            return;
        }
        RectF rectF = this.f33879i;
        float f = this.f33877g;
        canvas.drawRoundRect(rectF, f, f, this.f33874d);
    }

    /* renamed from: e */
    public void m57298e() {
        if (this.f33880j) {
            if (this.f33881k) {
                int min = Math.min(this.f33882l, this.f33883m);
                mo57301b(this.f33873c, min, min, getBounds(), this.f33878h);
                int min2 = Math.min(this.f33878h.width(), this.f33878h.height());
                this.f33878h.inset(Math.max(0, (this.f33878h.width() - min2) / 2), Math.max(0, (this.f33878h.height() - min2) / 2));
                this.f33877g = min2 * 0.5f;
            } else {
                mo57301b(this.f33873c, this.f33882l, this.f33883m, getBounds(), this.f33878h);
            }
            this.f33879i.set(this.f33878h);
            if (this.f33875e != null) {
                Matrix matrix = this.f33876f;
                RectF rectF = this.f33879i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f33876f.preScale(this.f33879i.width() / this.f33871a.getWidth(), this.f33879i.height() / this.f33871a.getHeight());
                this.f33875e.setLocalMatrix(this.f33876f);
                this.f33874d.setShader(this.f33875e);
            }
            this.f33880j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f33874d.getAlpha();
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.f33871a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f33874d.getColorFilter();
    }

    public float getCornerRadius() {
        return this.f33877g;
    }

    public int getGravity() {
        return this.f33873c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f33883m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f33882l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        if (this.f33873c != 119 || this.f33881k || (bitmap = this.f33871a) == null || bitmap.hasAlpha() || this.f33874d.getAlpha() < 255 || m57300c(this.f33877g)) {
            return -3;
        }
        return -1;
    }

    @NonNull
    public final Paint getPaint() {
        return this.f33874d;
    }

    public boolean hasAntiAlias() {
        return this.f33874d.isAntiAlias();
    }

    public boolean hasMipMap() {
        throw new UnsupportedOperationException();
    }

    public boolean isCircular() {
        return this.f33881k;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f33881k) {
            m57299d();
        }
        this.f33880j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f33874d.getAlpha()) {
            this.f33874d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z) {
        this.f33874d.setAntiAlias(z);
        invalidateSelf();
    }

    public void setCircular(boolean z) {
        this.f33881k = z;
        this.f33880j = true;
        if (z) {
            m57299d();
            this.f33874d.setShader(this.f33875e);
            invalidateSelf();
            return;
        }
        setCornerRadius(0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33874d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCornerRadius(float f) {
        if (this.f33877g == f) {
            return;
        }
        this.f33881k = false;
        if (m57300c(f)) {
            this.f33874d.setShader(this.f33875e);
        } else {
            this.f33874d.setShader(null);
        }
        this.f33877g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f33874d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f33874d.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setGravity(int i) {
        if (this.f33873c != i) {
            this.f33873c = i;
            this.f33880j = true;
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
        if (this.f33872b != i) {
            if (i == 0) {
                i = SyslogConstants.LOG_LOCAL4;
            }
            this.f33872b = i;
            if (this.f33871a != null) {
                m57302a();
            }
            invalidateSelf();
        }
    }
}
