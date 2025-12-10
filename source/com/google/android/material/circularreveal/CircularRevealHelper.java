package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;

    /* renamed from: a */
    public final Delegate f49558a;

    /* renamed from: b */
    public final View f49559b;

    /* renamed from: c */
    public final Path f49560c;

    /* renamed from: d */
    public final Paint f49561d;

    /* renamed from: e */
    public final Paint f49562e;

    /* renamed from: f */
    public CircularRevealWidget.RevealInfo f49563f;

    /* renamed from: g */
    public Drawable f49564g;

    /* renamed from: h */
    public boolean f49565h;

    /* renamed from: i */
    public boolean f49566i;

    /* loaded from: classes4.dex */
    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Strategy {
    }

    public CircularRevealHelper(Delegate delegate) {
        this.f49558a = delegate;
        View view = (View) delegate;
        this.f49559b = view;
        view.setWillNotDraw(false);
        this.f49560c = new Path();
        this.f49561d = new Paint(7);
        Paint paint = new Paint(1);
        this.f49562e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public final void m45366a(Canvas canvas) {
        if (m45362e()) {
            Rect bounds = this.f49564g.getBounds();
            float width = this.f49563f.centerX - (bounds.width() / 2.0f);
            float height = this.f49563f.centerY - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f49564g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: b */
    public final float m45365b(CircularRevealWidget.RevealInfo revealInfo) {
        return MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.f49559b.getWidth(), this.f49559b.getHeight());
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f49565h = true;
            this.f49566i = false;
            this.f49559b.buildDrawingCache();
            Bitmap drawingCache = this.f49559b.getDrawingCache();
            if (drawingCache == null && this.f49559b.getWidth() != 0 && this.f49559b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f49559b.getWidth(), this.f49559b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f49559b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f49561d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f49565h = false;
            this.f49566i = true;
        }
    }

    /* renamed from: c */
    public final void m45364c() {
        if (STRATEGY == 1) {
            this.f49560c.rewind();
            CircularRevealWidget.RevealInfo revealInfo = this.f49563f;
            if (revealInfo != null) {
                this.f49560c.addCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, Path.Direction.CW);
            }
        }
        this.f49559b.invalidate();
    }

    /* renamed from: d */
    public final boolean m45363d() {
        boolean z;
        CircularRevealWidget.RevealInfo revealInfo = this.f49563f;
        if (revealInfo != null && !revealInfo.isInvalid()) {
            z = false;
        } else {
            z = true;
        }
        if (STRATEGY == 0) {
            if (z || !this.f49566i) {
                return false;
            }
            return true;
        }
        return !z;
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f49566i = false;
            this.f49559b.destroyDrawingCache();
            this.f49561d.setShader(null);
            this.f49559b.invalidate();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (m45363d()) {
            int i = STRATEGY;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f49558a.actualDraw(canvas);
                        if (m45361f()) {
                            canvas.drawRect(0.0f, 0.0f, this.f49559b.getWidth(), this.f49559b.getHeight(), this.f49562e);
                        }
                    } else {
                        throw new IllegalStateException("Unsupported strategy " + i);
                    }
                } else {
                    int save = canvas.save();
                    canvas.clipPath(this.f49560c);
                    this.f49558a.actualDraw(canvas);
                    if (m45361f()) {
                        canvas.drawRect(0.0f, 0.0f, this.f49559b.getWidth(), this.f49559b.getHeight(), this.f49562e);
                    }
                    canvas.restoreToCount(save);
                }
            } else {
                CircularRevealWidget.RevealInfo revealInfo = this.f49563f;
                canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, this.f49561d);
                if (m45361f()) {
                    CircularRevealWidget.RevealInfo revealInfo2 = this.f49563f;
                    canvas.drawCircle(revealInfo2.centerX, revealInfo2.centerY, revealInfo2.radius, this.f49562e);
                }
            }
        } else {
            this.f49558a.actualDraw(canvas);
            if (m45361f()) {
                canvas.drawRect(0.0f, 0.0f, this.f49559b.getWidth(), this.f49559b.getHeight(), this.f49562e);
            }
        }
        m45366a(canvas);
    }

    /* renamed from: e */
    public final boolean m45362e() {
        if (!this.f49565h && this.f49564g != null && this.f49563f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m45361f() {
        if (!this.f49565h && Color.alpha(this.f49562e.getColor()) != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f49564g;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.f49562e.getColor();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        CircularRevealWidget.RevealInfo revealInfo = this.f49563f;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.isInvalid()) {
            revealInfo2.radius = m45365b(revealInfo2);
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        if (this.f49558a.actualIsOpaque() && !m45363d()) {
            return true;
        }
        return false;
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f49564g = drawable;
        this.f49559b.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f49562e.setColor(i);
        this.f49559b.invalidate();
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.f49563f = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f49563f;
            if (revealInfo2 == null) {
                this.f49563f = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (MathUtils.geq(revealInfo.radius, m45365b(revealInfo), 1.0E-4f)) {
                this.f49563f.radius = Float.MAX_VALUE;
            }
        }
        m45364c();
    }
}
