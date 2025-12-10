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
    public final Delegate f49570a;

    /* renamed from: b */
    public final View f49571b;

    /* renamed from: c */
    public final Path f49572c;

    /* renamed from: d */
    public final Paint f49573d;

    /* renamed from: e */
    public final Paint f49574e;

    /* renamed from: f */
    public CircularRevealWidget.RevealInfo f49575f;

    /* renamed from: g */
    public Drawable f49576g;

    /* renamed from: h */
    public boolean f49577h;

    /* renamed from: i */
    public boolean f49578i;

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
        this.f49570a = delegate;
        View view = (View) delegate;
        this.f49571b = view;
        view.setWillNotDraw(false);
        this.f49572c = new Path();
        this.f49573d = new Paint(7);
        Paint paint = new Paint(1);
        this.f49574e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public final void m45342a(Canvas canvas) {
        if (m45338e()) {
            Rect bounds = this.f49576g.getBounds();
            float width = this.f49575f.centerX - (bounds.width() / 2.0f);
            float height = this.f49575f.centerY - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f49576g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: b */
    public final float m45341b(CircularRevealWidget.RevealInfo revealInfo) {
        return MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.f49571b.getWidth(), this.f49571b.getHeight());
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f49577h = true;
            this.f49578i = false;
            this.f49571b.buildDrawingCache();
            Bitmap drawingCache = this.f49571b.getDrawingCache();
            if (drawingCache == null && this.f49571b.getWidth() != 0 && this.f49571b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f49571b.getWidth(), this.f49571b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f49571b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f49573d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f49577h = false;
            this.f49578i = true;
        }
    }

    /* renamed from: c */
    public final void m45340c() {
        if (STRATEGY == 1) {
            this.f49572c.rewind();
            CircularRevealWidget.RevealInfo revealInfo = this.f49575f;
            if (revealInfo != null) {
                this.f49572c.addCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, Path.Direction.CW);
            }
        }
        this.f49571b.invalidate();
    }

    /* renamed from: d */
    public final boolean m45339d() {
        boolean z;
        CircularRevealWidget.RevealInfo revealInfo = this.f49575f;
        if (revealInfo != null && !revealInfo.isInvalid()) {
            z = false;
        } else {
            z = true;
        }
        if (STRATEGY == 0) {
            if (z || !this.f49578i) {
                return false;
            }
            return true;
        }
        return !z;
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f49578i = false;
            this.f49571b.destroyDrawingCache();
            this.f49573d.setShader(null);
            this.f49571b.invalidate();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (m45339d()) {
            int i = STRATEGY;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f49570a.actualDraw(canvas);
                        if (m45337f()) {
                            canvas.drawRect(0.0f, 0.0f, this.f49571b.getWidth(), this.f49571b.getHeight(), this.f49574e);
                        }
                    } else {
                        throw new IllegalStateException("Unsupported strategy " + i);
                    }
                } else {
                    int save = canvas.save();
                    canvas.clipPath(this.f49572c);
                    this.f49570a.actualDraw(canvas);
                    if (m45337f()) {
                        canvas.drawRect(0.0f, 0.0f, this.f49571b.getWidth(), this.f49571b.getHeight(), this.f49574e);
                    }
                    canvas.restoreToCount(save);
                }
            } else {
                CircularRevealWidget.RevealInfo revealInfo = this.f49575f;
                canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, this.f49573d);
                if (m45337f()) {
                    CircularRevealWidget.RevealInfo revealInfo2 = this.f49575f;
                    canvas.drawCircle(revealInfo2.centerX, revealInfo2.centerY, revealInfo2.radius, this.f49574e);
                }
            }
        } else {
            this.f49570a.actualDraw(canvas);
            if (m45337f()) {
                canvas.drawRect(0.0f, 0.0f, this.f49571b.getWidth(), this.f49571b.getHeight(), this.f49574e);
            }
        }
        m45342a(canvas);
    }

    /* renamed from: e */
    public final boolean m45338e() {
        if (!this.f49577h && this.f49576g != null && this.f49575f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m45337f() {
        if (!this.f49577h && Color.alpha(this.f49574e.getColor()) != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f49576g;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.f49574e.getColor();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        CircularRevealWidget.RevealInfo revealInfo = this.f49575f;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.isInvalid()) {
            revealInfo2.radius = m45341b(revealInfo2);
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        if (this.f49570a.actualIsOpaque() && !m45339d()) {
            return true;
        }
        return false;
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f49576g = drawable;
        this.f49571b.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f49574e.setColor(i);
        this.f49571b.invalidate();
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.f49575f = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f49575f;
            if (revealInfo2 == null) {
                this.f49575f = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (MathUtils.geq(revealInfo.radius, m45341b(revealInfo), 1.0E-4f)) {
                this.f49575f.radius = Float.MAX_VALUE;
            }
        }
        m45340c();
    }
}