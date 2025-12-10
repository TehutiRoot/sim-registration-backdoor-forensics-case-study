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
    public static final float f9133m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f9134a;

    /* renamed from: b */
    public float f9135b;

    /* renamed from: c */
    public float f9136c;

    /* renamed from: d */
    public float f9137d;

    /* renamed from: e */
    public float f9138e;

    /* renamed from: f */
    public boolean f9139f;

    /* renamed from: g */
    public final Path f9140g;

    /* renamed from: h */
    public final int f9141h;

    /* renamed from: i */
    public boolean f9142i;

    /* renamed from: j */
    public float f9143j;

    /* renamed from: k */
    public float f9144k;

    /* renamed from: l */
    public int f9145l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f9134a = paint;
        this.f9140g = new Path();
        this.f9142i = false;
        this.f9145l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f9141h = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f9136c = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f9135b = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f9137d = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static float m64501a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        Rect bounds = getBounds();
        int i2 = this.f9145l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f4 = this.f9135b;
        float m64501a = m64501a(this.f9136c, (float) Math.sqrt(f4 * f4 * 2.0f), this.f9143j);
        float m64501a2 = m64501a(this.f9136c, this.f9137d, this.f9143j);
        float round = Math.round(m64501a(0.0f, this.f9144k, this.f9143j));
        float m64501a3 = m64501a(0.0f, f9133m, this.f9143j);
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
        float m64501a4 = m64501a(f, f2, this.f9143j);
        double d = m64501a;
        double d2 = m64501a3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f9140g.rewind();
        float m64501a5 = m64501a(this.f9138e + this.f9134a.getStrokeWidth(), -this.f9144k, this.f9143j);
        float f5 = (-m64501a2) / 2.0f;
        this.f9140g.moveTo(f5 + round, 0.0f);
        this.f9140g.rLineTo(m64501a2 - (round * 2.0f), 0.0f);
        this.f9140g.moveTo(f5, m64501a5);
        this.f9140g.rLineTo(round2, round3);
        this.f9140g.moveTo(f5, -m64501a5);
        this.f9140g.rLineTo(round2, -round3);
        this.f9140g.close();
        canvas.save();
        float strokeWidth = this.f9134a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f3))) / 4) * 2) + (strokeWidth * 1.5f) + this.f9138e);
        if (this.f9139f) {
            if (this.f9142i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(m64501a4 * i);
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f9140g, this.f9134a);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.f9135b;
    }

    public float getArrowShaftLength() {
        return this.f9137d;
    }

    public float getBarLength() {
        return this.f9136c;
    }

    public float getBarThickness() {
        return this.f9134a.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.f9134a.getColor();
    }

    public int getDirection() {
        return this.f9145l;
    }

    public float getGapSize() {
        return this.f9138e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9141h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9141h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.f9134a;
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getProgress() {
        return this.f9143j;
    }

    public boolean isSpinEnabled() {
        return this.f9139f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f9134a.getAlpha()) {
            this.f9134a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f) {
        if (this.f9135b != f) {
            this.f9135b = f;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f) {
        if (this.f9137d != f) {
            this.f9137d = f;
            invalidateSelf();
        }
    }

    public void setBarLength(float f) {
        if (this.f9136c != f) {
            this.f9136c = f;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f) {
        if (this.f9134a.getStrokeWidth() != f) {
            this.f9134a.setStrokeWidth(f);
            this.f9144k = (float) ((f / 2.0f) * Math.cos(f9133m));
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i) {
        if (i != this.f9134a.getColor()) {
            this.f9134a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9134a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i) {
        if (i != this.f9145l) {
            this.f9145l = i;
            invalidateSelf();
        }
    }

    public void setGapSize(float f) {
        if (f != this.f9138e) {
            this.f9138e = f;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        if (this.f9143j != f) {
            this.f9143j = f;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z) {
        if (this.f9139f != z) {
            this.f9139f = z;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z) {
        if (this.f9142i != z) {
            this.f9142i = z;
            invalidateSelf();
        }
    }
}
