package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* renamed from: fj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19964fj0 extends AbstractC17122yK {

    /* renamed from: c */
    public float f61939c;

    /* renamed from: d */
    public float f61940d;

    /* renamed from: e */
    public float f61941e;

    /* renamed from: f */
    public Path f61942f;

    public C19964fj0(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f61939c = 300.0f;
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: a */
    public void mo318a(Canvas canvas, Rect rect, float f) {
        this.f61939c = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f109013a).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f109013a).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f109013a).f50464a) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f109014b.isShowing() && ((LinearProgressIndicatorSpec) this.f109013a).showAnimationBehavior == 1) || (this.f109014b.isHiding() && ((LinearProgressIndicatorSpec) this.f109013a).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f109014b.isShowing() || this.f109014b.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f109013a).trackThickness * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f61939c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f109013a;
        this.f61940d = ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness * f;
        this.f61941e = ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackCornerRadius * f;
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: b */
    public void mo317b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f61939c;
        float f4 = (-f3) / 2.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f61942f);
        float f5 = this.f61940d;
        RectF rectF = new RectF(((f * f3) + f4) - (this.f61941e * 2.0f), (-f5) / 2.0f, f4 + (f2 * f3), f5 / 2.0f);
        float f6 = this.f61941e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        canvas.restore();
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: c */
    public void mo316c(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.f109013a).trackColor, this.f109014b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        Path path = new Path();
        this.f61942f = path;
        float f = this.f61939c;
        float f2 = this.f61940d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f61941e;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.f61942f, paint);
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: d */
    public int mo315d() {
        return ((LinearProgressIndicatorSpec) this.f109013a).trackThickness;
    }

    @Override // p000.AbstractC17122yK
    /* renamed from: e */
    public int mo314e() {
        return -1;
    }
}