package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* renamed from: Ap */
/* loaded from: classes4.dex */
public final class C0058Ap extends AbstractC17122yK {

    /* renamed from: c */
    public int f229c;

    /* renamed from: d */
    public float f230d;

    /* renamed from: e */
    public float f231e;

    /* renamed from: f */
    public float f232f;

    public C0058Ap(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f229c = 1;
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: a */
    public void mo318a(Canvas canvas, Rect rect, float f) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
        int i;
        float width = rect.width() / mo314e();
        float height = rect.height() / mo315d();
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f109013a;
        float f2 = (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).indicatorInset;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((CircularProgressIndicatorSpec) this.f109013a).indicatorDirection == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f229c = i;
        this.f230d = ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness * f;
        this.f231e = ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).trackCornerRadius * f;
        this.f232f = (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize - ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness) / 2.0f;
        if ((this.f109014b.isShowing() && ((CircularProgressIndicatorSpec) this.f109013a).showAnimationBehavior == 2) || (this.f109014b.isHiding() && ((CircularProgressIndicatorSpec) this.f109013a).hideAnimationBehavior == 1)) {
            this.f232f += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f109013a).trackThickness) / 2.0f;
        } else if ((this.f109014b.isShowing() && ((CircularProgressIndicatorSpec) this.f109013a).showAnimationBehavior == 1) || (this.f109014b.isHiding() && ((CircularProgressIndicatorSpec) this.f109013a).hideAnimationBehavior == 2)) {
            this.f232f -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f109013a).trackThickness) / 2.0f;
        }
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: b */
    public void mo317b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f230d);
        int i2 = this.f229c;
        float f4 = f * 360.0f * i2;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (1.0f + f2) - f;
        }
        float f5 = f3 * 360.0f * i2;
        float f6 = this.f232f;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.f231e > 0.0f && Math.abs(f5) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            m69189h(canvas, paint, this.f230d, this.f231e, f4);
            m69189h(canvas, paint, this.f230d, this.f231e, f4 + f5);
        }
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: c */
    public void mo316c(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.f109013a).trackColor, this.f109014b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        paint.setStrokeWidth(this.f230d);
        float f = this.f232f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: d */
    public int mo315d() {
        return m69188i();
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: e */
    public int mo314e() {
        return m69188i();
    }

    /* renamed from: h */
    public final void m69189h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f232f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    public final int m69188i() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f109013a;
        return ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize + (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset * 2);
    }
}