package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;

    /* renamed from: m */
    public static final float f9221m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f9222a;

    /* renamed from: b */
    public float f9223b;

    /* renamed from: c */
    public float f9224c;

    /* renamed from: d */
    public float f9225d;

    /* renamed from: e */
    public float f9226e;

    /* renamed from: f */
    public boolean f9227f;

    /* renamed from: g */
    public final Path f9228g;

    /* renamed from: h */
    public final int f9229h;

    /* renamed from: i */
    public boolean f9230i;

    /* renamed from: j */
    public float f9231j;

    /* renamed from: k */
    public float f9232k;

    /* renamed from: l */
    public int f9233l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f9222a = paint;
        this.f9228g = new Path();
        this.f9230i = false;
        this.f9233l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f9229h = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f9224c = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f9223b = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f9225d = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static float m64452a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        Rect bounds = getBounds();
        int i2 = this.f9233l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f4 = this.f9223b;
        float m64452a = m64452a(this.f9224c, (float) Math.sqrt(f4 * f4 * 2.0f), this.f9231j);
        float m64452a2 = m64452a(this.f9224c, this.f9225d, this.f9231j);
        float round = Math.round(m64452a(0.0f, this.f9232k, this.f9231j));
        float m64452a3 = m64452a(0.0f, f9221m, this.f9231j);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float m64452a4 = m64452a(f, f2, this.f9231j);
        double d = m64452a;
        double d2 = m64452a3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f9228g.rewind();
        float m64452a5 = m64452a(this.f9226e + this.f9222a.getStrokeWidth(), -this.f9232k, this.f9231j);
        float f5 = (-m64452a2) / 2.0f;
        this.f9228g.moveTo(f5 + round, 0.0f);
        this.f9228g.rLineTo(m64452a2 - (round * 2.0f), 0.0f);
        this.f9228g.moveTo(f5, m64452a5);
        this.f9228g.rLineTo(round2, round3);
        this.f9228g.moveTo(f5, -m64452a5);
        this.f9228g.rLineTo(round2, -round3);
        this.f9228g.close();
        canvas.save();
        float strokeWidth = this.f9222a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f3))) / 4) * 2) + (strokeWidth * 1.5f) + this.f9226e);
        if (this.f9227f) {
            if (this.f9230i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(m64452a4 * i);
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f9228g, this.f9222a);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.f9223b;
    }

    public float getArrowShaftLength() {
        return this.f9225d;
    }

    public float getBarLength() {
        return this.f9224c;
    }

    public float getBarThickness() {
        return this.f9222a.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.f9222a.getColor();
    }

    public int getDirection() {
        return this.f9233l;
    }

    public float getGapSize() {
        return this.f9226e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9229h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9229h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.f9222a;
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getProgress() {
        return this.f9231j;
    }

    public boolean isSpinEnabled() {
        return this.f9227f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f9222a.getAlpha()) {
            this.f9222a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f) {
        if (this.f9223b != f) {
            this.f9223b = f;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f) {
        if (this.f9225d != f) {
            this.f9225d = f;
            invalidateSelf();
        }
    }

    public void setBarLength(float f) {
        if (this.f9224c != f) {
            this.f9224c = f;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f) {
        if (this.f9222a.getStrokeWidth() != f) {
            this.f9222a.setStrokeWidth(f);
            this.f9232k = (float) ((f / 2.0f) * Math.cos(f9221m));
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i) {
        if (i != this.f9222a.getColor()) {
            this.f9222a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9222a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i) {
        if (i != this.f9233l) {
            this.f9233l = i;
            invalidateSelf();
        }
    }

    public void setGapSize(float f) {
        if (f != this.f9226e) {
            this.f9226e = f;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        if (this.f9231j != f) {
            this.f9231j = f;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z) {
        if (this.f9227f != z) {
            this.f9227f = z;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z) {
        if (this.f9230i != z) {
            this.f9230i = z;
            invalidateSelf();
        }
    }
}