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
public final class C0056Ap extends AbstractC17040xK {

    /* renamed from: c */
    public int f212c;

    /* renamed from: d */
    public float f213d;

    /* renamed from: e */
    public float f214e;

    /* renamed from: f */
    public float f215f;

    public C0056Ap(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f212c = 1;
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: a */
    public void mo540a(Canvas canvas, Rect rect, float f) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
        int i;
        float width = rect.width() / mo536e();
        float height = rect.height() / mo537d();
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f108314a;
        float f2 = (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).indicatorInset;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((CircularProgressIndicatorSpec) this.f108314a).indicatorDirection == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f212c = i;
        this.f213d = ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness * f;
        this.f214e = ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).trackCornerRadius * f;
        this.f215f = (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize - ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness) / 2.0f;
        if ((this.f108315b.isShowing() && ((CircularProgressIndicatorSpec) this.f108314a).showAnimationBehavior == 2) || (this.f108315b.isHiding() && ((CircularProgressIndicatorSpec) this.f108314a).hideAnimationBehavior == 1)) {
            this.f215f += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f108314a).trackThickness) / 2.0f;
        } else if ((this.f108315b.isShowing() && ((CircularProgressIndicatorSpec) this.f108314a).showAnimationBehavior == 1) || (this.f108315b.isHiding() && ((CircularProgressIndicatorSpec) this.f108314a).hideAnimationBehavior == 2)) {
            this.f215f -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f108314a).trackThickness) / 2.0f;
        }
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: b */
    public void mo539b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f213d);
        int i2 = this.f212c;
        float f4 = f * 360.0f * i2;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (1.0f + f2) - f;
        }
        float f5 = f3 * 360.0f * i2;
        float f6 = this.f215f;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.f214e > 0.0f && Math.abs(f5) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            m69049h(canvas, paint, this.f213d, this.f214e, f4);
            m69049h(canvas, paint, this.f213d, this.f214e, f4 + f5);
        }
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: c */
    public void mo538c(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.f108314a).trackColor, this.f108315b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        paint.setStrokeWidth(this.f213d);
        float f = this.f215f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: d */
    public int mo537d() {
        return m69048i();
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: e */
    public int mo536e() {
        return m69048i();
    }

    /* renamed from: h */
    public final void m69049h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f215f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    public final int m69048i() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f108314a;
        return ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize + (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset * 2);
    }
}
